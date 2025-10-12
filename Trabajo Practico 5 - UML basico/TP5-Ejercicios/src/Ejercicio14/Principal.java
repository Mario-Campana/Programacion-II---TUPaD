/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Cumpleaños", 120);
        EditorVideo editor_video = new EditorVideo();
        editor_video.exportar("MP4", proyecto); // Dependencia de Creación
    }
    
}
