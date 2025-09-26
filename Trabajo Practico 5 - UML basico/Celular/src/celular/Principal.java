/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celular;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear Batería
        Bateria bateria = new Bateria("Samsung-EB-BG950", 3000);

        // Crear Usuario
        Usuario usuario = new Usuario("Ana Gómez", "98765432");

        // Crear Celular (agregación + asociación bidireccional)
        Celular celular = new Celular("356789123456789", "Samsung", "Galaxy S9", bateria, usuario);

        // Mostrar datos
        System.out.println(celular);
        System.out.println("El usuario " + usuario.getNombre() +
                           " tiene el celular IMEI: " + usuario.getCelular().getImei());
    }
}
