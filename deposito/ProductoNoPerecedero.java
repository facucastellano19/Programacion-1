package deposito;

public class ProductoNoPerecedero extends Producto {
    private int descuento;
    
    public ProductoNoPerecedero(String nombre, float precio, int descuento){
        super(nombre, precio);
        this.descuento = descuento;
    }   
    
    @Override
    public float getValor(){
        return precio - (precio * ((float)descuento /100));
    }
    
    @Override
    public String toString(){
        return super.toString()+ " - NO Perecedero";
    }    
}
