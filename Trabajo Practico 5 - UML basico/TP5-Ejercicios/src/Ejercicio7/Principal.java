/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Mario Luis Campana", "123456789");
        Motor motor = new Motor("Nafta", "A1D2F589E1G136SDF");
        Vehiculo vehiculo = new Vehiculo("AB388JE", "Fiat Doblo", motor);   //Agregación (Vehículo tiene un Motor)
        
        conductor.setVehiculo(vehiculo);  //Asociación bidireccional (solo se necesita uno)
        vehiculo.setConductor(conductor); //Asociación bidireccional (solo se necesita uno)
        
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Vehículo: " + vehiculo.getModelo());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());
    }
    
}
