/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear Autor
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");

        // Crear Editorial
        Editorial editorial = new Editorial("Sudamericana", "Av. Siempre Viva 742");

        // Crear Libro (asociación + agregación)
        Libro libro = new Libro("Cien Años de Soledad", "978-84-376-0494-7", autor, editorial);

        // Mostrar datos
        System.out.println(libro);
        System.out.println("El autor del libro \"" + libro.getTitulo() + "\" es " +
                           libro.getAutor().getNombre());
        System.out.println("Publicado por la editorial: " + libro.getEditorial().getNombre());
    }
}
