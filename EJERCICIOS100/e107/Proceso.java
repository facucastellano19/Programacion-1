
package e107;

import java.util.ArrayList;
import java.util.HashSet;


public class Proceso {
    public void procesarFrase(String frase) {
        
        String[] palabras = frase.split("\\s+");

        ArrayList<String> listaPalabras = new ArrayList<>();

        // Agrego las palabras al ArrayList
        for (String palabra : palabras) {
            listaPalabras.add(palabra);
        }

        // Creo un HashSet para almacenar palabras unicas
        HashSet<String> conjuntoPalabras = new HashSet<>();

        // Copio palabras del ArrayList al HashSet
        for (String palabra : listaPalabras) {
            conjuntoPalabras.add(palabra);
        }
        
        System.out.println("ArrayList de palabras: " + listaPalabras);
        System.out.println("HashSet de palabras: " + conjuntoPalabras);
    }

    
/*
a)
La principal diferencia en las salidas entre el ArrayList y el HashSet es cómo manejan los elementos duplicados 
y el orden en el que los almacenan. Para almacenar elementos en el mismo orden en que se introducen y permitir duplicados, 
usamos ArrayList. Si solo necesito elementos únicos y no me importa el orden, utilizo HashSet.
*/

}
