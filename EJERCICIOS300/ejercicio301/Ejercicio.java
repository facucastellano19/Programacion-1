// Luca Ferrante
package ejercicio301;

import java.util.Scanner;

public class Ejercicio {
    public void menu() {

        long nNum;

        System.out.println("Calculo de factorial");
        System.out.println("Ingrese un entero:");
        
        Scanner sc = new Scanner(System.in);
        
        nNum = sc.nextLong();

        System.out.println("\n \t" + nNum + "!= " + factorial_iter(nNum));

        System.out.println("\n \t" + nNum + "!= " + factorial_recur(nNum));

    }

    public long factorial_recur(long n) {
        if (n <= 1) {
            return 1;
        } else {
            long resultado = n * factorial_recur(n - 1);
            return resultado;
        }
    }

    static long factorial_iter(long n) {

        long fact = 1;
        for (long i = 1; i <= n; i++) {
            fact = i * fact;
        }
        return fact;
    }
}
