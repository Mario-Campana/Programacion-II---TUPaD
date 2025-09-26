    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edicionvideo;

/**
 *
 * @author Mario Campana
 */
public class EditorVideo {
    // Dependencia de creación: crea un Render dentro del método
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Se exportó el proyecto: " + render);
    }
}

