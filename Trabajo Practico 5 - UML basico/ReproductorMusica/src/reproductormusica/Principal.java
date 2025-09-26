/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reproductormusica;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear artista
        Artista artista = new Artista("Soda Stereo", "Rock");

        // Crear canción
        Cancion cancion = new Cancion("De música ligera", artista);

        // Crear reproductor
        Reproductor reproductor = new Reproductor();

        // Usar dependencia (el reproductor usa la canción pero no la almacena)
        reproductor.reproducir(cancion);
    }
}
