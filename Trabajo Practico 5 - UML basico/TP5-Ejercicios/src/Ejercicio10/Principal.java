/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        Titular titular = new Titular("Mario Luis Campana", "33913153");
        ClaveSeguridad cs = new ClaveSeguridad("Clave1234", "2025-09-04");
        CuentaBancaria cuenta = new CuentaBancaria("153941200025666358", 200000.0, "Clave1234", "2025-09-04");
        
        titular.setCuenta(cuenta);  //Asociación bidireccional, solo se necesita uno de los dos
        cuenta.setTitular(titular); //Asociación bidireccional, solo se necesita uno de los dos
        
        
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("CBU: " + cuenta.getCbu());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo());
    }
    
}
