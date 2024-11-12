
package e107;

import java.util.Scanner;


public class E107 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();

        Proceso pr = new Proceso();

        pr.procesarFrase(frase);
    }
    
}
