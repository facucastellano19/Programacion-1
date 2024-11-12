package deposito;

import java.time.LocalDate;
import java.time.Month;

public class Deposito {

    public static void main(String[] args) { 
        DepositoProductos deposito = DepositoProductos.getDeposito();
        deposito.agregarProducto("Leche", 1200, LocalDate.of(2024, Month.SEPTEMBER, 12));
        deposito.agregarProducto("Leche", 1000, LocalDate.of(2024, Month.SEPTEMBER, 12));
        deposito.agregarProducto("Manteca", 1500, LocalDate.of(2024, Month.SEPTEMBER, 10));
        deposito.agregarProducto("Crema", 4000, LocalDate.of(2024, Month.SEPTEMBER, 16));
        deposito.agregarProducto("Margarina", 1400, LocalDate.of(2024, Month.DECEMBER, 1));
        deposito.agregarProducto("Harina", 800, 10);
        deposito.agregarProducto("Polenta", 2000, 20);
        deposito.agregarProducto("Arroz", 1500, 0);
        deposito.agregarProducto("Fideos", 2200, 5);
        deposito.agregarProducto("Martillo", 10000);
        deposito.agregarProducto("Tuerca", 500);
        
        DepositoProductos elDepositoDeProductos = DepositoProductos.getDeposito();
        
        elDepositoDeProductos.listarProductosNoPerecederos();
        
        elDepositoDeProductos.eliminarProducto("Arroz");
        System.out.println("-------------------------------");
        elDepositoDeProductos.listarProductos();
        
        System.out.println(elDepositoDeProductos.toString());
    }
    
}
