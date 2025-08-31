/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

/**
 *
 * @author Mario Campana
 * 
 * 3. Encapsulamiento con la Clase Libro
 * a. Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
 * Métodos requeridos: Getters para todos los atributos. Setter con validación 
 * para añoPublicacion.
 * Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego 
 * con uno válido, mostrar la información final.
 * 
 * 
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        
        libro1.setTitulo("Cien años de Soledad");
        libro1.setAutor("Gabriel García Márquez");
        libro1.setAnioPublicacion(1966);
        
        libro1.mostrarDatos();
        
        System.out.println("---------------------------");
        
        System.out.println("----Cambio año inválido (numero negativo)----");
        libro1.setAnioPublicacion(-25);
            
        System.out.println("---------------------------");
        
        System.out.println("----Cambio año válido----");
        libro1.setAnioPublicacion(1967);
        
        libro1.mostrarDatos();
        
        
    }
    
}
