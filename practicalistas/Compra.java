package practicalistas;

public class Compra {

    private String producto;
    private double precio;

    public Compra(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return producto + ": $" + precio;
    }
}
