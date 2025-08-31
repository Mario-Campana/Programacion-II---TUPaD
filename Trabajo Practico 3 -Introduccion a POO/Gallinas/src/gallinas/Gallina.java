/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gallinas;

/**
 *
 * @author Mario Campana
 */
public class Gallina {
    // Atributos
    private int idGallina;
    private int edad;           
    private int huevosPuestos;

    // Uso un constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    // Método: la gallina pone un huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    // Método: la gallina envejece
    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ha envejecido. Nueva edad: " + edad);
    }

    // Método: mostrar estado
    public void mostrarEstado() {
        System.out.println(" Gallina " + idGallina + " Edad: " + edad + " Huevos puestos: " + huevosPuestos);
                           
                          
    }
}