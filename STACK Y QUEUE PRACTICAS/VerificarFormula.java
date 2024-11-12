
package practicas1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class VerificarFormula {
    
    
    
    public static boolean esExpresionValida(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : expresion.toCharArray()) {
            if (caracter == '(') {
                pila.push(caracter); // Si es un paréntesis de apertura, se agrega a la pila
            } else if (caracter == ')') {
                if (pila.isEmpty()) {
                    return false; // Si hay un cierre sin apertura, es incorrecto
                }
                pila.pop(); // Se quita el paréntesis de apertura correspondiente
            }
        }

        return pila.isEmpty(); // Si la pila está vacía, los paréntesis están balanceados
    }
    
    
}
