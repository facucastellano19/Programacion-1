package ej202;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//202- Escribir un programa que deje ingresar por consola valores en palabras que representan colores.
//Estos valores ingresados se deberán verificar si son parte de colores válidos para nuestro programa. 
//La validación se hará buscando el valor ingresado en una lista de colores, y para armar esta lista, se 
//deberá leer el contenido de un archivo de texto. En ese archivo, cada valor de color debe ser una linea 
//de texto del archivo. Terminar el proceso ingresando asterisco.   
//Negro azul marrón gris verde naranja rosa púrpura rojo blanco amarillo turquesa verde oliva verde menta borgoña lavandamagenta salmón cian beige rosado verde oscuro verde oliva lila amarillo pálido fucsia mostaza, ETC
    
public class ProcesoColores {

    private ArrayList<String> coloresValidos;

    public ProcesoColores() {
        this.coloresValidos = new ArrayList<>();
    }

    public void leerColoresDesdeArchivo(String rutaArchivo) {
        try {

            System.out.println("Leyendo colores validos desde el archivo...");

            File archivo = new File(rutaArchivo);
            Scanner sc = new Scanner(archivo);

            while (sc.hasNextLine()) {
                String color = sc.nextLine().trim().toLowerCase(); // El método trim() se utiliza para eliminar los espacios en blanco al principio y al final de una cadena. En el contexto que muestras:
                coloresValidos.add(color);
            }

            if (coloresValidos.isEmpty()) {
                System.out.println("No se encontraron colores validos en el archivo");
            }

        } catch (Exception e) {
            System.out.println("Archivo no encontrado: " + rutaArchivo);
            e.printStackTrace();
        }
    }

    public void validarColoresUsuario() {
        if (coloresValidos.isEmpty()) {
            System.out.println("No se puede validar, ya que no hay colores validos cargados");
            return;
        }

        Scanner sc = new Scanner(System.in);
        String colorIngresado;

        System.out.println("Ingrese colores (o * para terminar):");

        while (true) {
            colorIngresado = sc.nextLine().trim().toLowerCase();

            if (colorIngresado.equals("*")) {
                System.out.println("Proceso terminado");
                break;
            }

            if (coloresValidos.contains(colorIngresado)) {
                System.out.println("Color valido");
            } else {
                System.out.println("Color invalido");
            }
        }

    }
}
