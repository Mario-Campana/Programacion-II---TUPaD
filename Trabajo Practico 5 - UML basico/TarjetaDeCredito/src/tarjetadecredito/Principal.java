/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarjetadecredito;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear Banco
        Banco banco = new Banco("Banco Nación", "30-12345678-9");

        // Crear Cliente
        Cliente cliente = new Cliente("María López", "45678901");

        // Crear Tarjeta (agregación + asociación bidireccional)
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "12/28", cliente, banco);

        // Mostrar datos
        System.out.println(tarjeta);
        System.out.println("El cliente " + cliente.getNombre() +
                           " tiene la tarjeta número: " + cliente.getTarjeta().getNumero());
        System.out.println("Emitida por el banco: " + tarjeta.getBanco().getNombre());
    }
}
