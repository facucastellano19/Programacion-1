
package e101;

import java.util.Scanner;


public class Proceso {
    
    private int[] array = new int[5];


    public void rellenarValores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce " + array.length + " numeros:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            array[i] = sc.nextInt(); 
        }
    }

    public void mostrarValores() {
        System.out.println("Indices y valores del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indice " + i + ": " + array[i]); 
        }    
    
    
    }
    
    
}
