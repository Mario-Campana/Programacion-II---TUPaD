/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Mario Campana
 */
public class Libro {
    
    //Atributos
    private String titulo;
    private String isbn;
    private Autor autor;            //Atributo objeto de tipo Autor (Asociación unidireccional)
    private Editorial editorial;    //Atributo objeto de tipo Editorial (Agregación)

    //Constructor
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;             //Agregación
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {     //Asociacion unidireccional con Autor
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {     //Asociacion unidireccional con Editorial
        this.editorial = editorial;
    }
    
}
