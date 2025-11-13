/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_parte2;

/**
 *
 * @author Mario Campana
 */

public class Cliente implements Notificable {

    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public String getEmail() { return email; }

    @Override
    public void notificar(String mensaje) {
        // Simulación de notificación (por consola)
        System.out.println("Notificando a " + nombre + " (" + email + "): " + mensaje);
    }
}

