package deposito;

public class ProductoFerreteria extends Producto {
    public ProductoFerreteria(String nombre, float precio){
        super(nombre, precio);
    }
    
    @Override
    public String toString(){
        return super.toString()+ " - Ferreteria";
    } 

    @Override
    public float getValor() {
        return precio;
    }
}
