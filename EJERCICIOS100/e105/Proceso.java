package e105;

import java.util.ArrayList;
import java.util.HashSet;

public class Proceso {

    ArrayList<Integer> array1 = new ArrayList<>();
    ArrayList<Integer> array2 = new ArrayList<>();
    ArrayList<Integer> arrayRepetidos = new ArrayList<>();

    public void rellenarConAleatorios() {
        for (int i = 0; i < 100; i++) {
            int numeroAleatorio = (int) (Math.random() * 101);
            array1.add(numeroAleatorio);
        }
        
        for (int i = 0; i < 100; i++) {
            int numeroAleatorio = (int) (Math.random() * 101);
            array2.add(numeroAleatorio);
        }
    }

    public void mostrarRepetidos() {
        HashSet<Integer> set = new HashSet<>(array1); 
        for (Integer num : array2) {
            if (set.contains(num)) {
                arrayRepetidos.add(num);
            }
        }

        System.out.println("Numeros repetidos: " + arrayRepetidos);
    }

}
