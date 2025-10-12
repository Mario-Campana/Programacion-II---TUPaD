/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        Autor autor = new Autor("Jorge Luis Borges", "Argentino");
        Editorial editorial = new Editorial("Planeta", "Av. Santa Fe 1645 CABA");
        Libro libro = new Libro("El aleph", "978-950-563-656-3", editorial);        //Agregación - Cada libro tiene una editorial
        libro.setAutor(autor); //Uso del set para Asociacion unidireccional

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());

    }
}