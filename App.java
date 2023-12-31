/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package control_Iventarios;

public class App {
    public static void main(String[] args) {
        Drogueria drogueria = new Drogueria();

        // Agregar productos a la droguería
        Producto producto1 = new Producto("Producto1", "Tipo1", 20, 10, 10.0);
        Producto producto2 = new Producto("Producto2", "Tipo2", 15, 8, 15.0);
        drogueria.agregarProducto(producto1);
        drogueria.agregarProducto(producto2);

        // Realizar ventas
        drogueria.venderProducto("Producto1", 5);
        drogueria.venderProducto("Producto2", 10);

        // Realizar pedidos
        drogueria.hacerPedido("Producto1");

        // Obtener producto más vendido y menos vendido
        System.out.println("Producto más vendido: " + drogueria.productoMasVendido());
        System.out.println("Producto menos vendido: " + drogueria.productoMenosVendido());

        // Obtener el total de ventas
        System.out.println("Total de ventas: $" + drogueria.totalVentas());
    }
}
