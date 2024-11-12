package e103;

import java.util.ArrayList;


public class E103 {


    public static void main(String[] args) {
       
        Proceso pr = new Proceso();
        
        pr.rellenarValores();
        System.out.println("El promedio es: " + pr.calcularPromedio());
        System.out.println(pr.mayorMenorIgualDelPromedio());
        
            

        }
    }
    

