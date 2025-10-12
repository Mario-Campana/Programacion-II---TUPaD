/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Mario Luis Campana", "33913153");
        Banco banco = new Banco("Banco Galicia", "30-50000173-5");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1111-2222-3333-4444", "11/27", banco); //Agregación (Tarjeta de Crédito tiene un atributo Banco)
        
        cliente.setTarjeta(tarjeta); //Asociación bidireccional(solo se necesita una de las dos)
        tarjeta.setCliente(cliente); //Asociación bidireccional(solo se necesita una de las dos)
        
        System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());

    }
}
