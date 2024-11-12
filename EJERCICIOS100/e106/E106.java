
package e106;

import java.util.Scanner;


public class E106 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese una frase
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        // Crear una instancia de FraseProcessor
        Proceso pr = new Proceso();
        pr.procesarFrase(frase);
        
        
    }
    
}
