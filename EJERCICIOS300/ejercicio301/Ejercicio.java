package ejercicio301;

import java.util.Scanner;

//301 – Realizar un programa en lenguaje java para el cálculo del factorial de un numero. Hacer dos 
//tipos de a implementaciones, una usando el método iterativo, y otro utilizando recursividad. Debido a 
//que el resultado de un factorial crece rápidamente, implementar un control en el ingreso, para que no 
//se pueda llegar a calcular un número ingresado mayor de un límite. Ese límite debe averiguarse 
//previamente, y colocarlo como un parámetro interno de la clase que hace el cálculo. Ese límite debe 
//servir para que el cálculo del factorial no termine siendo demasiado grande para ser representado 
//correctamente por un tipo de dato long.
    
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
