import java.util.HashMap;
import java.util.Map;

public class RegistroCarta {
    private Map<Carta, Integer> inventario;

    public RegistroCarta() {
        inventario = new HashMap<>();
    }

    public void registrarCarta(Carta carta) {
        inventario.put(carta, inventario.getOrDefault(carta, 0) + 1);
    }

    public int totalCartas() {
        return inventario.values().stream().mapToInt(Integer::intValue).sum();
    }

    public Map<Carta, Integer> obtenerResumen() {
        return inventario;
    }

    public boolean estaVacio() {
        return inventario.isEmpty();
    }
}

