package ej206;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

//206 - Realizar un programa que genere un ArrayList con 25 elementos, y cada elemento será un 
//número aleatorios entre 1 y 1000. Luego recorrer el ArrayList, y escribir los 25 elementos a un archivo 
//de texto, un elemento por linea. Antes de salir del programa, informar el nombre y ruta del archivo 
//donde se escribió la información.
    
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
