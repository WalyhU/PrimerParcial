package BusquedaBinaria;

public class BusquedaBinaria {
    private Herramientas[] herramientas;

    public BusquedaBinaria(Herramientas[] herramientas) {
        this.herramientas = herramientas;
    }

    public void setArreglo(Herramientas[] herramientas) {
        this.herramientas = herramientas;
    }

    public Herramientas[] getHerramientas() {
        return this.herramientas;
    }

    public int buscar(int valor) {
        int inicio = 0;
        int fin = this.herramientas.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (this.herramientas[medio].getId() == valor) {
                return medio;
            } else if (this.herramientas[medio].getId() < valor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }
}
