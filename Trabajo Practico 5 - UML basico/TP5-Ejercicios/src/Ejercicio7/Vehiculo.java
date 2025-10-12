/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Mario Campana
 */
public class Vehiculo {
    //Atributos
    private String patente;
    private String modelo;
    private Motor motor;            //Atributo de la clase Motor (Agregación)
    private Conductor conductor;    //Atributo de la clase Conductor (Asociación bidireccional)

    //Constructor
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;             //Agregación (Vehiculo tiene un Motor)
    }

    //Getters y Setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {     //Set de la clase Conductor (Asociación bidireccional)
        this.conductor = conductor;
        //Evita el bucle infinito
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
    
}
