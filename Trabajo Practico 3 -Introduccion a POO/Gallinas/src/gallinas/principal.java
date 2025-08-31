/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gallinas;

/**
 *
 * @author Mario Campana
 * 
 * 4. Gestión de Gallinas en Granja Digital
 * a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
 * Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
 * Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
 * 
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // Creamos dos gallinas
        Gallina g1 = new Gallina(1, 2); // id=1, edad=2
        
        Gallina g2 = new Gallina(2, 1); // id=2, edad=1

        // Métodos para gallina 1
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        // Métodos para gallina 2
        g2.ponerHuevo();
        g2.envejecer();

        // Mostrar estado final
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
    
}