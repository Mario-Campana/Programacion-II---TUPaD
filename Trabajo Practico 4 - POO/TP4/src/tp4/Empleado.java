/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Mario Campana
 */

public class Empleado {
    
    private int id;                     // Identificador único del empleado
    private String nombre;              // Nombre completo
    private String puesto;              // Cargo
    private double salario;             // Salario actual
    private static int idAuto = 100;    // Generador automático de IDs
    private static int totalEmpleados;  // Contador global de empleados creados

    // Constructor I
    public Empleado(int id, String nombre, String puesto, double salario) {
        if (id <= 0) {
            System.out.println("ID inválido. Se asignará uno automático.");
            this.id = idAuto++;
        } else {
            this.id = id;
        }
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    // Constructor II (usa ID automático y salario fijo inicial)
    public Empleado(String nombre, String puesto) {
        this(idAuto++, nombre, puesto, 1000);
    }   

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    // Setters
    public void setPuesto(String puesto) { this.puesto = puesto; } 
    
    
    // Actualización de salario por porcentaje
    public void actualizarPorcentaje(double porcentaje) {
       this.salario = salario + salario * (porcentaje/100);
    }
    
    // Actualización de salario con cantidad fija
   public void actualizarSumaFija(double cantidad_fija) {
      this.salario = salario + cantidad_fija;
   }

    // Método toString()
    @Override
    public String toString() {
        return "Empleado{" + 
               "id=" + id + 
               ", nombre='" + nombre + '\'' + 
               ", puesto='" + puesto + '\'' + 
               ", salario=" + salario + 
               '}';
    }
    
    // Método mostrar el total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
    

