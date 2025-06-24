import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistroCarta registro = new RegistroCarta();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        try{
            do {
                System.out.println("\n--- MENÚ ---");
                System.out.println("1. Registrar carta");
                System.out.println("2. Ver total de cartas");
                System.out.println("3. Ver cartas registradas y cuántas veces se repiten");
                System.out.println("4. Salir");
                System.out.print("Elige una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre de la carta: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Descripción de la carta: ");
                        String descripcion = scanner.nextLine();

                        System.out.print("Costo de mana: ");
                        int mana = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        Carta nuevaCarta = new Carta(nombre, descripcion, mana);
                        registro.registrarCarta(nuevaCarta);
                        System.out.println("Carta registrada.");
                        break;

                    case 2:
                        System.out.println("Total de cartas: " + registro.totalCartas());
                        break;

                    case 3:
                        if (registro.estaVacio()) {
                            System.out.println("No hay cartas registradas.");
                        } else {
                            System.out.println("Cartas registradas:");
                            for (Map.Entry<Carta, Integer> entry : registro.obtenerResumen().entrySet()) {
                                Carta c = entry.getKey();
                                System.out.println("\n" + c);
                                System.out.println("Cantidad: " + entry.getValue());
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Hasta luego.");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }

            } while (opcion != 4);
        } catch (InputMismatchException e){
            System.out.println("\n" + "Solo se aceptan Números");
        }


        scanner.close();
    }
}

