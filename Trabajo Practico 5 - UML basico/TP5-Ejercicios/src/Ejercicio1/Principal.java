/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class Principal {
    public static void main(String[] args) {
        Titular titular = new Titular("Mario Luis Campana", "33913153");
        Pasaporte pasaporte = new Pasaporte("AB958769", "2016-01-07", "imagen.jpg", "JPEG");
        
        titular.setPasaporte(pasaporte); //Asignamos el pasaporte al titular (con una alcanza)
        pasaporte.setTitular(titular); //Asignamos el titular al pasaporte (con una alcanza)
        
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Número de pasaporte: " + pasaporte.getNumero());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
        
    }
}