package ej204;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PalabrasPila {

    private ArrayList<String> palabras = new ArrayList<>();

    public void ingresarPalabras() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese palabras (ingrese '*' para terminar):");

        while (true) {
            String palabra = sc.nextLine();
            if (palabra.equals("*")) {
                break;
            }
            palabras.add(palabra);
        }
    }

    public void procesar_imprimir() {
        Stack<String> pila = new Stack<>();

        for (String palabra : palabras) {
            pila.push(palabra);
        }

        System.out.println("c) El orden de las palabras es en inverso cuando las sacamos de la pila:");
        while (!pila.isEmpty()) {
            String palabra = pila.pop();
            System.out.println(palabra);
        }

    }
}
