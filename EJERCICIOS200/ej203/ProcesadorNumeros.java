package ej203;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//203 - Realizar una clase que tenga como atributos una cola y tres listas. Se deberá poder ingresar 
//datos de tipo números enteros en la cola. Además deberá tener un método llamada procesarEntrada, 
//que deberá armar con los datos de la cola, tres listas que respeten el orden de llegada de los datos a 
//la cola, es decir, la primer lista empieza con el primer elemento de la cola, la segunda lista con el 
//segundo elemento de la cola, la tercer lista con el tercero de la cola, y así continuando hasta vaciar la 
//cola. Se deberá poder imprimir la entrada y las tres salidas para verificar.
    
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
