package deposito;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProductoPerecedero extends Producto{
    private LocalDate fechaVencimiento;
    
    public ProductoPerecedero(String nombre, float precio, LocalDate fechaVencimiento){
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }
    
    private int obtenerDescuento(){
        LocalDate fechaActual = LocalDate.now();
        long diferenciaDias = ChronoUnit.DAYS.between(fechaActual, fechaVencimiento);
        if (diferenciaDias <= 1) {
            return 80;
        } else if (diferenciaDias > 1 && diferenciaDias <= 5) {
            return 50;
        } else if (diferenciaDias > 5 && diferenciaDias <= 10) {
            return 20;
        }
        return 0;
    }
    
    @Override
    public float getValor(){
        int descuento = obtenerDescuento();
        return precio - (precio * ((float)descuento / 100));
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Perecedero";
    }
}
