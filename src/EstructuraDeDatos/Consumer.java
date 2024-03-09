package EstructuraDeDatos;

public class Consumer {
    private Object[] pedidos;

    public Consumer(Object[] pedidos) {
        this.pedidos = pedidos;
    }

    public void setArreglo(Object[] pedidos) {
        this.pedidos = pedidos;
    }

    public Object[] getPedidos() {
        return this.pedidos;
    }
}
