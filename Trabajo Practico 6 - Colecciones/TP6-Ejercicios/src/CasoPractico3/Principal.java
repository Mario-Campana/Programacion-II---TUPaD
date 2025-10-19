/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico3;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // ===== Tarea 1: Crear profesores =====
        Profesor prof1 = new Profesor("P001", "Juan López", "Matemáticas");
        Profesor prof2 = new Profesor("P002", "Beatriz Pérez", "Física");
        Profesor prof3 = new Profesor("P003", "Mario García", "Literatura");

        // ===== Tarea 2: Crear cursos =====
        Curso c1 = new Curso("C101", "Álgebra I");
        Curso c2 = new Curso("C102", "Física I");
        Curso c3 = new Curso("C103", "Literatura Universal");
        Curso c4 = new Curso("C104", "Cálculo");
        Curso c5 = new Curso("C105", "Física II");

        // ===== Tarea 2: Crear universidad y agregar profesores y cursos =====
        Universidad uni = new Universidad("Universidad Central");
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // ===== Tarea 3: Asignar profesores a cursos =====
        uni.asignarProfesorACurso("C101", "P001"); // Álgebra I -> Ana
        uni.asignarProfesorACurso("C104", "P001"); // Cálculo -> Ana
        uni.asignarProfesorACurso("C102", "P002"); // Física I -> Juan
        uni.asignarProfesorACurso("C105", "P002"); // Física II -> Juan
        uni.asignarProfesorACurso("C103", "P003"); // Literatura -> Lucía

        // ===== Tarea 4: Listar cursos y profesores con sus cursos =====
        System.out.println("\n=== Listado de cursos con profesor ===");
        uni.listarCursos();

        System.out.println("\n=== Listado de profesores con sus cursos ===");
        uni.listarProfesores();

        // ===== Tarea 5: Cambiar profesor de un curso =====
        System.out.println("\n=== Cambiar profesor de C105 a Ana López ===");
        uni.asignarProfesorACurso("C105", "P001"); // Física II -> Ana

        // Verificar sincronización
        System.out.println("\nCursos de Ana López después del cambio:");
        prof1.listarCursos();
        System.out.println("\nCursos de Juan Pérez después del cambio:");
        prof2.listarCursos();

        // ===== Tarea 6: Remover un curso =====
        System.out.println("\n=== Eliminar curso C103 (Literatura Universal) ===");
        uni.eliminarCurso("C103");

        // Verificar que desapareció de Lucía
        System.out.println("\nCursos de Lucía García después de eliminar C103:");
        prof3.listarCursos();

        // ===== Tarea 7: Remover un profesor =====
        System.out.println("\n=== Eliminar profesor Juan Pérez ===");
        uni.eliminarProfesor("P002");

        // Cursos que dictaba Juan ahora deben tener profesor = null
        System.out.println("\nCursos de Física que antes tenía Juan:");
        for (Curso c : new Curso[]{c2, c5}) {
            c.mostrarInfo();
        }

        // ===== Tarea 8: Reporte de cantidad de cursos por profesor =====
        uni.reporteCantidadCursosPorProfesor();
    }
}
