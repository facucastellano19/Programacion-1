package e102;

import java.util.Scanner;


public class E102 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del ArrayList");
        int tamaño = sc.nextInt();
        
        Proceso ArrayList1 = new Proceso(tamaño);
        
        ArrayList1.rellenarConAleatorios(tamaño);
        ArrayList1.mostrarValoresYSumar();
        
        
        
        
        
    }
    
}
