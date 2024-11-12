package deposito;

import java.util.Objects;

public abstract class Producto {
    protected String nombre;
    protected float precio;
    
    public Producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    }    
    
    abstract public float getValor();

    @Override
    public String toString() {
        return nombre + " - Precio bruto: " + precio + " - Valor: " + getValor();
    }      

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.nombre.equals(other.nombre);
    }
    
    
}
