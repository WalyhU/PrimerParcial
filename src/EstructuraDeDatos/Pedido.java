package EstructuraDeDatos;

public class Pedido {
    private String nombre;
    private int id;

    public Pedido(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getId() {
        return this.id;
    }
}
