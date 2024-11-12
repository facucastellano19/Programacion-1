package e102;

import java.util.ArrayList;
import java.util.Scanner;


public class Proceso {
    
    
    ArrayList<Integer> array;

    public Proceso(int tamaño) {
       array = new ArrayList<>(tamaño);        
    }
 
    
    public void rellenarConAleatorios(int cantidad) {
        for (int i = 0; i < cantidad; i++) {           
            int numeroAleatorio = (int) (Math.random() * 10);
            array.add(numeroAleatorio);
        }
    }
    
    public void mostrarValoresYSumar() {
        int suma = 0;
        System.out.println("Contenido del ArrayList:");

        for (int i = 0; i < array.size(); i++) {
            System.out.println("Indice " + i + ": " + array.get(i));
            suma += array.get(i); 
        }

        System.out.println("Suma total: " + suma);
    }    
    
    
        
    
    
    
}
