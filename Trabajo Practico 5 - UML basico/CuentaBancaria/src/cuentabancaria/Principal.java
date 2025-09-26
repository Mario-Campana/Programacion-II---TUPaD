/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear Titular
        Titular titular = new Titular("Laura Martínez", "44556677");

        // Crear CuentaBancaria con clave de seguridad (composición)
        CuentaBancaria cuenta = new CuentaBancaria("0011223344556677889900", 250000.0,
                                                   "CLV123", "2025-09-25");

        // Asociar cuenta ↔ titular
        cuenta.setTitular(titular);

        // Mostrar datos
        System.out.println(cuenta);
        System.out.println("Titular de la cuenta: " + cuenta.getTitular().getNombre());
        System.out.println("Cuenta del titular: " + titular.getCuenta().getCbu());
    }
}
