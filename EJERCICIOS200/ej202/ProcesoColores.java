package ej202;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
                String color = sc.nextLine().trim().toLowerCase();
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
