package control_Iventarios;

import java.util.ArrayList;
import java.util.List;

public class Drogueria {
    private List<Producto> productos;

    public Drogueria() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void venderProducto(String nombreProducto, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto)) {
                producto.vender(cantidad);
                return;
            }
        }
        System.out.println("No se encontró el producto en la droguería.");
    }

    public void hacerPedido(String nombreProducto) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto)) {
                producto.hacerPedido();
                return;
            }
        }
        System.out.println("No se encontró el producto en la droguería.");
    }

    public String productoMasVendido() {
        Producto masVendido = productos.get(0);
        for (Producto producto : productos) {
            if (producto.getUnidadesVendidas() > masVendido.getUnidadesVendidas()) {
                masVendido = producto;
            }
        }
        return masVendido.getNombre();
    }

    public String productoMenosVendido() {
        Producto menosVendido = productos.get(0);
        for (Producto producto : productos) {
            if (producto.getUnidadesVendidas() < menosVendido.getUnidadesVendidas()) {
                menosVendido = producto;
            }
        }
        return menosVendido.getNombre();
    }

    public double totalVentas() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getUnidadesVendidas() * producto.getPrecioVenta();
        }
        return total;
    }
}
