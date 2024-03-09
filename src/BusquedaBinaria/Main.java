package BusquedaBinaria;

import BusquedaBinaria.BusquedaBinaria;
import BusquedaBinaria.Herramientas;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Implementación de la búsqueda binaria
        Herramientas[] herramientas = {
                new Herramientas("Martillo", 123),
                new Herramientas("Destornillador", 456),
                new Herramientas("Llave inglesa", 789),
                new Herramientas("Sierra", 234),
                new Herramientas("Taladro", 567)
        };
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria(herramientas);

        int idABuscar = 789;
        int indiceBinario = busquedaBinaria.buscar(idABuscar);

        System.out.println("\nBúsqueda binaria:");
        if (indiceBinario != -1) {
            System.out.println("La herramienta con id " + idABuscar + " se encuentra en el índice " + indiceBinario);
        } else {
            System.out.println("La herramienta con id " + idABuscar + " no se encuentra en el arreglo");
        }
    }
}