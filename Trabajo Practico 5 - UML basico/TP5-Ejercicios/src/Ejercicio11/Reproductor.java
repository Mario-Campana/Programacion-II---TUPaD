/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Mario Campana
 */
public class Reproductor {
    
    public void reproducir(Cancion cancion) {               //Dependencia de uso (parámetro de un método)
        System.out.println("Se está reproduciendo la canción: " + 
                cancion.getTitulo() + " del artista " + 
                cancion.getArtista().getNombre());
    }
}
