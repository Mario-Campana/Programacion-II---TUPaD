/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascota;

/**
 *
 * @author Mario Campana
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println("Nombre de la mascota:" + " " + nombre);
        System.out.println("Especie:" + " " + especie);
        System.out.println("Edad:" + " " + edad + " años");
    }    
    
    void cumplirAnios(){
        edad = edad + 1;
    }
    
}
