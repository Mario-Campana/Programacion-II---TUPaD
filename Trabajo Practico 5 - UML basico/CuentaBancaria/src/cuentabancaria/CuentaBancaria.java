/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author Mario Campana
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // Composición
    private Titular titular;               // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        // La clave se crea junto con la cuenta (composición)
        this.claveSeguridad = new ClaveSeguridad(codigoClave, ultimaModificacion);
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setCuenta(this); // mantener bidireccionalidad
    }

    @Override
    public String toString() {
        return "CuentaBancaria [cbu=" + cbu + ", saldo=" + saldo +
               ", claveSeguridad=" + claveSeguridad + "]";
    }
}
