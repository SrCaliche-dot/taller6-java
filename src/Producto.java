public class Producto {

    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public double valorTotal() {
        return precio * stock;
    }

    public String toString() {
        return String.format(
            "%-12s  $%7.2f   stock: %3d   valor: $%8.2f",
            nombre, precio, stock, valorTotal());
    }
}