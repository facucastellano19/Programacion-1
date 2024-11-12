package practicas1;

import java.util.Stack;

public class FraseAlReves {

    public String Invertida(String palabra) {

        Stack<Character> pila = new Stack<>();

        for (char caracter : palabra.toCharArray()) {
            pila.push(caracter);
        }

        StringBuilder fraseinvertida = new StringBuilder();

        while (!pila.isEmpty()) {
            fraseinvertida.append(pila.pop());
        }

        return fraseinvertida.toString();
    }

}
