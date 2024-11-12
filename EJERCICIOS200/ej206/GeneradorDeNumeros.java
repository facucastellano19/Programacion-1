package ej206;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GeneradorDeNumeros {

    public void generarYEscribir() {

        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        
        for (int i = 0; i < 25; i++) {
            int numero = (int) (Math.random() * 1000) + 1; 
            numerosAleatorios.add(numero);
        }

        String nombreArchivo = "C:/temporal/numeros.txt";

        try (PrintWriter writer = new PrintWriter(nombreArchivo)) { 
            for (Integer numero : numerosAleatorios) {
                writer.println(numero); 
            }
            System.out.println("Numeros escritos en el archivo: " + nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo crear el archivo");
        }
    }

    public static void main(String[] args) {
        GeneradorDeNumeros generador = new GeneradorDeNumeros();
        generador.generarYEscribir(); 
    }
}
