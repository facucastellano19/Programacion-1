package ej203;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProcesadorNumeros {

    private Queue<Integer> cola = new LinkedList<>();
    private List<Integer> lista1 = new ArrayList<>();
    private List<Integer> lista2 = new ArrayList<>();
    private List<Integer> lista3 = new ArrayList<>();

    public void agregarNumero(int numero) {
        cola.add(numero);
    }

    public void procesarEntrada() {
        int contador = 1;

        while (!cola.isEmpty()) {
            int numero = cola.poll();
            if (contador == 1) {
                lista1.add(numero);
            } else if (contador == 2) {
                lista2.add(numero);
            } else if (contador == 3) {
                lista3.add(numero);
                contador = 0; // Reiniciar el contador cuando llega a 3
            }
            contador++; 
        }
    }

    public void imprimirCola() {
        System.out.println("Cola entrada: " + cola);
    }

    public void imprimirListas() {
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista 3: " + lista3);
    }

}
