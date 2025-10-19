/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico2;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // ===== Tarea 1: Crear biblioteca =====
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // ===== Tarea 2: Crear autores =====
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombia");
        Autor autor2 = new Autor("A002", "J.K. Rowling", "Reino Unido");
        Autor autor3 = new Autor("A003", "George Orwell", "Reino Unido");

        // ===== Tarea 3: Agregar 5 libros a la biblioteca =====
        biblioteca.agregarLibro("ISBN001", "Cien Años de Soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "Harry Potter y la Piedra Filosofal", 1997, autor2);
        biblioteca.agregarLibro("ISBN003", "1984", 1949, autor3);
        biblioteca.agregarLibro("ISBN004", "Harry Potter y la Cámara Secreta", 1998, autor2);
        biblioteca.agregarLibro("ISBN005", "El Coronel No Tiene Quien Le Escriba", 1961, autor1);

        // ===== Tarea 4: Listar todos los libros =====
        System.out.println("=== Listado de todos los libros ===");
        biblioteca.listarLibros();

        // ===== Tarea 5: Buscar un libro por ISBN =====
        String isbnBuscar = "ISBN003";
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn(isbnBuscar);
        System.out.println("\n=== Búsqueda de libro por ISBN: " + isbnBuscar + " ===");
        if (libroEncontrado != null) {
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("Libro con ISBN " + isbnBuscar + " no encontrado.");
        }

        // ===== Tarea 6: Filtrar libros por año =====
        int anioFiltrar = 1997;
        System.out.println("\n=== Libros publicados en el año " + anioFiltrar + " ===");
        for (Libro l : biblioteca.filtrarLibrosPorAnio(anioFiltrar)) {
            l.mostrarInfo();
        }

        // ===== Tarea 7: Eliminar un libro por ISBN =====
        String isbnEliminar = "ISBN004";
        if (biblioteca.eliminarLibro(isbnEliminar)) {
            System.out.println("\nLibro con ISBN " + isbnEliminar + " eliminado correctamente.");
        } else {
            System.out.println("\nNo se encontró el libro con ISBN " + isbnEliminar + " para eliminar.");
        }

        System.out.println("=== Libros restantes ===");
        biblioteca.listarLibros();

        // ===== Tarea 8: Mostrar cantidad total de libros =====
        System.out.println("\n=== Cantidad total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros() + " ===");

        // ===== Tarea 9: Listar todos los autores disponibles =====
        System.out.println("\n=== Autores disponibles en la biblioteca ===");
        biblioteca.mostrarAutoresDisponibles();
    }
}
