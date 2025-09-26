/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear Motor
        Motor motor = new Motor("V8", "MTR12345");

        // Crear Vehiculo con motor
        Vehiculo vehiculo = new Vehiculo("AB123CD", "Ford Mustang", motor);

        // Crear Conductor
        Conductor conductor = new Conductor("Lucas Fernández", "LIC998877");

        // Asociar Conductor con Vehiculo (bidireccional)
        vehiculo.setConductor(conductor);

        // Mostrar datos
        System.out.println(vehiculo);
        System.out.println("Conductor del vehículo: " + vehiculo.getConductor().getNombre());
        System.out.println("Vehículo del conductor: " + conductor.getVehiculo().getPatente());
    }
}
