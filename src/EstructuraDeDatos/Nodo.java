package EstructuraDeDatos;
public class Nodo<T> {
    T item;
    Nodo<T> next;
    Nodo<T> prev;

    public Nodo(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return String.valueOf(item);
    }

}