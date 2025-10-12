/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        Artista artista = new Artista("Soda Stereo", "Rock Nacional");
        Cancion cancion = new Cancion("Canción Animal", artista);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion); // Dependencia de uso(canción es parámetro del método reproducir de reproductor)
    }
}
