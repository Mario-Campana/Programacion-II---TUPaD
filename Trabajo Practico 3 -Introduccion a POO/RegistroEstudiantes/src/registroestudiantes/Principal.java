/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registroestudiantes;

/* Desarrollar en Java los siguientes ejercicios aplicando los conceptos de
programación orientada a objetos:

1. Registro de Estudiantes
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos). 
*/

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo un nuevo objeto de la clase Estudiante
        Estudiante est1 = new Estudiante();
        
        //Asigno valores a los atributos
        est1.nombre = "Ana";
        est1.apellido = "García";
        est1.curso ="3A";
        est1.calificacion = 8;
                
        //Muestro la información
        est1.mostrarInfo();
        
        System.out.println("--------------");
        
        //Subo la calificación 2 puntos y muestro la información
        est1.subirCalificacion(2);
        est1.mostrarInfo();
        
        System.out.println("--------------");
        
        //Bajo la calificación  1 punto y muestro la información
        est1.bajarCalificacion(1);
        est1.mostrarInfo();
    }
    
    
    
            
}
