/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Mario Campana
 */
public class CuentaBancaria {
    //Atributos
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;   //Atributo del tipo ClaveSeguridad (Composición)
    private Titular titular;        //Atributo del tipo ClaveSeguridad (Asociación bidireccional)

    //Constructor
    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);        //Composición, se crea el objeto ClaveSeguridad con sus atributos dentro del constructor
    }

    //Getters y Setters
    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {       
        return titular;
    }

    public void setTitular(Titular titular) {       //Setter para asociación bidireccional con Titular
        this.titular = titular;
        //Evita el bucle infinito
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }
    
}
