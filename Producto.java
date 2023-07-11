package control_Iventarios;

public class Producto {

    private String nombre;
    private String tipo;
    private int cantidadActual;
    private int cantidadMinima;
    private double precioVenta;
    private int unidadesVendidas;

    public Producto(String nombre, String tipo, int cantidadActual, int cantidadMinima, double precioVenta) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadActual = cantidadActual;
        this.cantidadMinima = cantidadMinima;
        this.precioVenta = precioVenta;
        this.unidadesVendidas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void vender(int cantidad) {
        if (cantidadActual >= cantidad) {
            cantidadActual -= cantidad;
            unidadesVendidas += cantidad;
            System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("No hay suficientes unidades disponibles para la venta.");
        }
    }

    public void hacerPedido() {
        if (cantidadActual < cantidadMinima) {
            int cantidadPedido = cantidadMinima - cantidadActual;
            cantidadActual += cantidadPedido;
            System.out.println("Pedido realizado: " + cantidadPedido + " unidades de " + nombre);
        } else {
            System.out.println("No es necesario hacer un pedido para " + nombre);
        }
    }
}
