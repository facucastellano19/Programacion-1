package ej203;

import java.util.Scanner;


public class Ej203 {


    public static void main(String[] args) {
        ProcesadorNumeros procesador = new ProcesadorNumeros();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un numero entero (o escriba 'salir' para terminar): ");
            String entrada = sc.nextLine(); 

            if (entrada.equalsIgnoreCase("salir")) {
                break; 
            }

            try {
                int numero = Integer.parseInt(entrada);
                procesador.agregarNumero(numero); 
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un numero válido.");
            }
        }
        
        procesador.imprimirCola();
        procesador.procesarEntrada();
        procesador.imprimirListas();

    }
}


