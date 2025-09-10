/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        //Empleados registrados
        Empleado e1 = new Empleado(1, "Ana Fernandez", "Gerente", 5000);
        Empleado e2 = new Empleado("Luis Campos", "Programador");
        Empleado e3 = new Empleado("Carla Brunetti", "Diseñadora");
        Empleado e4 = new Empleado(2,"Omar Pesce", "Vendedor", 1500);
        
        //Muestro los 4 empleados cargados con toString()
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        
        System.out.println("--------------------------------------");
        
        //Modifico el salario de e2 por porcentaje
        System.out.println("Se actualiza un 10% el salario de " + e2);
        e2.actualizarPorcentaje(10);
        
        System.out.println("--------------------------------------");
        
        //Modifico el salario de e3 por suma fija
        System.out.println("Se actualiza 500USD el salario de " + e3);
        e3.actualizarSumaFija(500);
        
        
        System.out.println("--------------------------------------");
        
        //Muestro los 4 empleados cargados con toString()
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        
        System.out.println("--------------------------------------");
        
        //Uso del método totalEmpleados()
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
 