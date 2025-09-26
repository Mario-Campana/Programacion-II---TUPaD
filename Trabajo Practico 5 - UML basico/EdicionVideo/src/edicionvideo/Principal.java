/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edicionvideo;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear proyecto
        Proyecto proyecto = new Proyecto("Corto Animado", 15);

        // Crear editor y exportar proyecto
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto);
    }
}

