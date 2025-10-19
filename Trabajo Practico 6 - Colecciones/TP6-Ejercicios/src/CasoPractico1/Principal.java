/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear inventario (Tarea 1)
        Inventario inventario = new Inventario();

        // Crear productos (todos electrodomésticos)
        Producto p1 = new Producto("P001", "Licuadora", 2500.0, 15, CategoriaProducto.HOGAR);
        Producto p2 = new Producto("P002", "Microondas", 5000.0, 10, CategoriaProducto.HOGAR);
        Producto p3 = new Producto("P003", "Horno Eléctrico", 7000.0, 8, CategoriaProducto.HOGAR);
        Producto p4 = new Producto("P004", "Cafetera", 3000.0, 12, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Plancha", 1500.0, 20, CategoriaProducto.HOGAR);

        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        // ===== TAREA 2: Listar todos los productos mostrando info y categoría =====
        System.out.println("=== Listado de todos los productos ===");
        inventario.listarProductos();
        
        // ===== TAREA 3: Buscar un producto por ID =====
        String idBuscado = "P003";
        Producto encontrado = inventario.buscarProductoPorId(idBuscado);

        System.out.println("\n=== Búsqueda de producto por ID: " + idBuscado + " ===");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto con ID " + idBuscado + " no encontrado.");
        }

        // ===== Tarea 5: Eliminar un producto por ID =====
        String idEliminar = "P002";
        if (inventario.eliminarProducto(idEliminar)) {
            System.out.println("\nProducto con ID " + idEliminar + " eliminado correctamente.");
        } else {
            System.out.println("\nNo se encontró el producto con ID " + idEliminar + " para eliminar.");
        }
        System.out.println("=== Productos restantes ===");
        inventario.listarProductos();

        // ===== Tarea 6: Actualizar stock de un producto =====
        String idActualizar = "P005";
        int nuevaCantidad = 25;
        if (inventario.actualizarStock(idActualizar, nuevaCantidad)) {
            System.out.println("\nStock del producto " + idActualizar + " actualizado a " + nuevaCantidad);
        } else {
            System.out.println("\nNo se encontró el producto con ID " + idActualizar + " para actualizar stock.");
        }

        // ===== Tarea 7: Mostrar total de stock disponible =====
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("\n=== Total de stock disponible en inventario: " + totalStock + " unidades ===");

        // ===== Tarea 8: Obtener producto con mayor stock =====
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("\n=== Producto con mayor stock ===");
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        // ===== Tarea 9: Filtrar productos con precios entre $1000 y $3000 =====
        System.out.println("\n=== Productos con precio entre $1000 y $3000 ===");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) {
            p.mostrarInfo();
        }

        // ===== Tarea 10: Mostrar categorías disponibles con descripciones =====
        System.out.println("\n=== Categorías disponibles ===");
        inventario.mostrarCategoriasDisponibles();
    }

}

