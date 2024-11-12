package e104;

import java.util.ArrayList;
import java.util.Scanner;

public class Proceso {

    ArrayList<Integer> array = new ArrayList<>();

    public void rellenarValores() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 7 numeros:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            array.add(sc.nextInt());
        }
    }

    public String mayorMenorValor() {
        int mayorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;
        int posicionMayor = -1;
        int posicionMenor = -1;

        // Inicializar con valores extremos
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > mayorValor) {
                mayorValor = array.get(i);
                posicionMayor = i;
            }

            if (array.get(i) < menorValor) {
                menorValor = array.get(i);
                posicionMenor = i;
            }
        }

        return "El numero de mayor valor es: " + mayorValor + " en la posicion: " + posicionMayor
                + ", el menor es: " + menorValor + " en la posicion: " + posicionMenor;
    }

}
