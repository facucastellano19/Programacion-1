
package ej201;

import java.util.Scanner;


public class Ej201 {


    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        CuitCuil cuit = new CuitCuil();
        System.out.println("Ingrese un cuit: ");
        String nuevo = sc.nextLine();
              
        cuit.setCuit(nuevo);
       
        String valor = cuit.getCuitFormato();
        
        System.out.println(valor);
        
        
                
        
        
    }
    
}
