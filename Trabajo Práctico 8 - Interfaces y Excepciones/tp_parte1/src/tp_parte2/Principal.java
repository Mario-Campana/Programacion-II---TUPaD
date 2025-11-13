/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_parte2;

/**
 *
 * @author Mario Campana
 */


public class Principal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Mario", "mario@live.com");

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 8000));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        pedido.setEstado("En preparación");
        pedido.setEstado("Enviado");

        // Probar pagos
        Pago tarjeta = new TarjetaCredito("1111-2222-3333-4444", "Mario");
        tarjeta.procesarPago(pedido.calcularTotal());

        Pago paypal = new PayPal("mario-paypal@live.com");
        paypal.procesarPago(pedido.calcularTotal());
    }
}

