/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Mario Campana
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> sueldosEmpleados = new ArrayList<>();
        
        EmpleadoPlanta p1 = new EmpleadoPlanta("Juan Gonzalez");
        EmpleadoPlanta p2 = new EmpleadoPlanta("Marta Urieta");
        EmpleadoTemporal t1 = new EmpleadoTemporal("Pedro Hermosilla");
        EmpleadoTemporal t2 = new EmpleadoTemporal("Laura Alonso");
        
        sueldosEmpleados.add(p1);
        sueldosEmpleados.add(p2);
        sueldosEmpleados.add(t1);
        sueldosEmpleados.add(t2);
        
        for (Empleado emp : sueldosEmpleados) {
            if (emp instanceof EmpleadoPlanta){
                System.out.println(emp.getNombre() + "sueldo: " + emp.calcularSueldo());
            } else if (emp instanceof EmpleadoTemporal){
                System.out.println(emp.getNombre() + "sueldo: " + emp.calcularSueldo());
            }
        }
    }
}