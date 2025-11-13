/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_parte2;

/**
 *
 * @author Mario Campana
 */


public class TarjetaCredito implements PagoConDescuento {

    private String numeroTarjeta;
    private String titular;

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // Ejemplo: 10% de descuento
        return monto * 0.90;
    }

    @Override
    public void procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("Procesando pago con Tarjeta de " + titular +
                " por $" + montoConDescuento);
    }
}

