/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroestudiantes;

/**
 *
 * @author Mario Campana
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
     // Método para mostrar la información del estudiante
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }  
    
    // Método para subir la calificación
    void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Nueva calificación: " + calificacion);
    }
                
     // Método para bajar la calificación
    void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0; // Evitamos que sea negativa
        }
        System.out.println("Nueva calificación: " + calificacion);
    }
}
