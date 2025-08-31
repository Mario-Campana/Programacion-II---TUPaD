/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

/**
 *
 * @author Mario Campana
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    
    //Métodos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setAnioPublicacion(int anioPublicacion) {
    if (anioPublicacion <= 0) {
        System.out.println("Debe ingresar un año válido (mayor que 0).");
    } 
    else {
        this.anioPublicacion = anioPublicacion;
    }
    }
    
    public void mostrarDatos(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
        
}


