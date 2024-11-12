package e108;

import java.util.ArrayList;
import java.util.Scanner;

public class E108 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaPalabras = new ArrayList<>();

        System.out.println("Introduce palabras o frases (escribe '*' para terminar):");

        while (true) {
            String entrada = sc.nextLine();

            if (entrada.equals("*")) {
                break;
            }

            if (!listaPalabras.contains(entrada)) {
                listaPalabras.add(entrada);
            } else {
                System.out.println("La entrada ya fue ingresada, por favor introduce otra palabra o frase.");
            }
        }

        System.out.println("Contenido del ArrayList:");
        for (String palabra : listaPalabras) {
            System.out.println(palabra);
        }

    }

}
