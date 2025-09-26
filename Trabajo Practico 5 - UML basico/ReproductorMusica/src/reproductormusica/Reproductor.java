/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductormusica;

/**
 *
 * @author Mario Campana
 */
public class Reproductor {
    // Dependencia de uso: usa Cancion como parámetro, pero no la guarda
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo " + cancion);
    }
}
