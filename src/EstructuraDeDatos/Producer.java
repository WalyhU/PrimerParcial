package EstructuraDeDatos;

public class Producer {
    private Object[] pedidos;

    public Producer(Object[] pedidos) {
        this.pedidos = pedidos;
    }

    public void setArreglo(Object[] pedidos) {
        this.pedidos = pedidos;
    }

    public Object[] getPedidos() {
        return this.pedidos;
    }
}
