
package e103;

import java.util.ArrayList;
import java.util.Scanner;

public class Proceso {
    
    ArrayList<Integer> array = new ArrayList<>(10);   
    
    public void rellenarValores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 numeros:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            array.add(sc.nextInt());
        }
    }
    
    public double calcularPromedio() {
        int suma = 0;
        for (int i = 0; i < array.size(); i++) {
            suma += array.get(i);
        }
        return suma / 10; 
    }
     
    
    public String mayorMenorIgualDelPromedio(){
        double promedio = calcularPromedio();
        int mayorAlPromedio = 0;
        int menorAlPromedio = 0;
        int igualAlPromedio = 0;
        
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > promedio) {
                mayorAlPromedio++;
            } else if (array.get(i) < promedio) {
                menorAlPromedio++; 
            } else {
                igualAlPromedio++;
            }
                    
        }
        return "Mayores al promedio: " + mayorAlPromedio +
               ", menores al promedio: " + menorAlPromedio +
               ", iguales al promedio: " + igualAlPromedio;
    }
    
}
