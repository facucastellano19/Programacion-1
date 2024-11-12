
package practicalistas;

import java.util.ArrayList;
import java.util.List;


public class RegistroDeCompras {
    
    private List<Compra> compras = new ArrayList<>(); // Instanciación fuera del constructor

    public void agregarCompra(String producto, double precio) {
        compras.add(new Compra(producto, precio));
        System.out.println("Compra agregada: " + producto);
    }

    public void eliminarCompra(int indice) {
        if (indice >= 0 && indice < compras.size()) {
            Compra compraEliminada = compras.remove(indice);
            System.out.println("Compra eliminada: " + compraEliminada);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void mostrarCompras() {
        System.out.println("Registro de compras:");
        for (int i = 0; i < compras.size(); i++) {
            System.out.println(i + ": " + compras.get(i));
        }
    }    
}
