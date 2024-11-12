
package e106;

import java.util.ArrayList;


public class Proceso {
    
    public void procesarFrase(String frase) {
        
        // Dividir la frase en palabras, "\\s+" sirve para 1 o mas espacios en blanco
        String[] palabras = frase.split("\\s+");

        ArrayList<String> listaPalabras = new ArrayList<>();

        for (String palabra : palabras) {
            listaPalabras.add(palabra);
        }
        
        System.out.println("La cantidad de palabras en la frase es: " + listaPalabras.size()); 
    
    
    }
}