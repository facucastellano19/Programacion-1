package practicas1;

import java.util.Stack;


public class VerificarPalindromo {
    

    
    public boolean esPalindromo(String palabra){
        
        Stack <Character> pila = new Stack<>();        
        // Agregamos a la pila caracter por caracter
        for (char caracter : palabra.toCharArray()) {
            pila.push(caracter);
        }
        
        for (char caracter : palabra.toCharArray()) {
            if (caracter != pila.pop()) {
                return false;
            } 
        }
        
        return true;
        
    }
    
    
}
