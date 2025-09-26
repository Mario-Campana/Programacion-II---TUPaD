/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservasrestaurant;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear Cliente
        Cliente cliente = new Cliente("Carla Martínez", "1122334455");

        // Crear Mesa
        Mesa mesa = new Mesa(5, 4);

        // Crear Reserva (asociación + agregación)
        Reserva reserva = new Reserva("2025-09-30", "20:00", cliente, mesa);

        // Mostrar datos
        System.out.println(reserva);
        System.out.println("La reserva es para el cliente: " + reserva.getCliente().getNombre());
        System.out.println("Asignada a la mesa número: " + reserva.getMesa().getNumero());
    }
}
