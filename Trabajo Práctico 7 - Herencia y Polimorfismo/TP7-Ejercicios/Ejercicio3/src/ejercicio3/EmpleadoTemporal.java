/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Mario Campana
 */
public class EmpleadoTemporal extends Empleado {
    
    public EmpleadoTemporal(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularSueldo(){
        return 3000;
    }
}
