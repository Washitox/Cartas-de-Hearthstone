public class Carta {
    private String nombre;
    private String descripcion;
    private int mana;

    public Carta(String nombre, String descripcion, int mana) {
        this.nombre = nombre.trim().toLowerCase();
        this.descripcion = descripcion.trim();
        this.mana = mana;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getMana() {
        return mana;
    }

    // Igualamos cartas por su nombre
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Carta)) return false;
        Carta otra = (Carta) obj;
        return nombre.equals(otra.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nMana: " + mana + "\nDescripción: " + descripcion;
    }
}

