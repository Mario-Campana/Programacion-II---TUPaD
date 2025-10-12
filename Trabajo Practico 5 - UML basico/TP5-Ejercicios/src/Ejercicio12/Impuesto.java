/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Mario Campana
 */
public class Impuesto {
    //Atributos
    private double monto;
    private Contribuyente contribuyente;    //Atributo de la clase Contribuyente (Asociación unidireccional)

    //Constructor
    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    //Getters y Setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {     //Setter para asociación unidireccional con Contribuyente
        this.contribuyente = contribuyente;
    }
    
}
