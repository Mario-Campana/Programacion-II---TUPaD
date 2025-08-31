/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascota;

/**
 *
 * @author Mario Campana
 * 
 * 2. Registro de Mascotas
 * a. Crear una clase Mascota con los atributos: nombre, especie, edad.
 * Métodos requeridos: mostrarInfo(), cumplirAnios().
 * Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mascota mascota1 = new Mascota();
        
        mascota1.nombre = "Pepe";
        mascota1.especie = "Perro";
        mascota1.edad = 4;
        
        //Muestra info
        mascota1.mostrarInfo();
        
        System.out.println("------Cumpleaños------");
        
        //Cumple años
        mascota1.cumplirAnios();
        
        //Muestra info nueva
        mascota1.mostrarInfo();
        
        
        
    }
    
}
