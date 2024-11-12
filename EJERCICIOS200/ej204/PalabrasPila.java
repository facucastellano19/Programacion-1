package ej204;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//204 - Realizar un programa que deje ingresar palabras desde consola, y la lista de ingresos debe 
//guardarse en un objeto ArrayList, el fin del ingreso se hace con un asterisco. Luego implementar un 
//método que haga lo siguiente:
//a. recorrer el ArrayList y colocar todos los elementos en un objeto Stack (pila).
//b. recorrer el objeto Stack, y sacar de la pila uno a uno los elementos, e imprimirlos en pantalla.
//c. Responder, cual es el orden de la impresión de salida respecto a la entrada ?

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
