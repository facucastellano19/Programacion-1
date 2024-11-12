package deposito;

import java.time.LocalDate;
import java.util.ArrayList;

public class DepositoProductos {
    private static DepositoProductos instanciaDeposito = null;
    private ArrayList<Producto> listaProductos;
    private String nombre;
    private static String variable;
    
    private DepositoProductos(){
        listaProductos = new ArrayList<>();
    }
    
    public static DepositoProductos getDeposito(){
        if(instanciaDeposito == null) {
            instanciaDeposito = new DepositoProductos();
        }
        return instanciaDeposito;
    }
    
    public void agregarProducto(String nombre, float precio, LocalDate fechaVencimiento){
        ProductoPerecedero producto = new ProductoPerecedero(nombre, precio, fechaVencimiento);
        boolean existe = false;
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).equals(producto)) {
                existe = true;
                break;
            }
        }
        if(!existe) {
            listaProductos.add(producto);
        }
    }
    
    public void agregarProducto(String nombre, float precio, int descuento){
        ProductoNoPerecedero producto = new ProductoNoPerecedero(nombre, precio, descuento);
        listaProductos.add(producto);
    } 
    
    public void agregarProducto(String nombre, float precio) {
        ProductoFerreteria producto = new ProductoFerreteria(nombre, precio);
        listaProductos.add(producto);       
    }
    
    public void eliminarProducto(String nombre) {       
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getNombre().equals(nombre)) {
                listaProductos.remove(i);
                return;
            }
        }
    }
    
    public void listarProductosPerecederos() {        
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i) instanceof ProductoPerecedero) {
                System.out.println(listaProductos.get(i).toString());
            }
        }
    }       
    
    public void listarProductosNoPerecederos() {        
        for (Producto producto: listaProductos){
            if (producto instanceof ProductoNoPerecedero) {
                System.out.println(producto.toString());
            }
        }
    }
    
    public void listarProductosFerreteria() {        
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i) instanceof ProductoFerreteria) {
                System.out.println(listaProductos.get(i).toString());
            }
        }
    }   
    
    public void listarProductos(){
        listarProductosNoPerecederos();
        listarProductosPerecederos();
        listarProductosFerreteria();
    }
    
  
}
