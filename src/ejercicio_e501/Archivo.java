
package ejercicio_e501;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Archivo {
    
    private String nombre;
    private ArrayList<String> contenido;

    public Archivo() {
        setNombre("c:/temporal/plantilla_examen1.csv");
        setContenido(new ArrayList<String>());
    }  
    
   public void leer_archivo() {

        try {
            
            File entrada = new File(this.getNombre());
            System.out.println("Leyendo entrada ...");
            Scanner scan = new Scanner(entrada);

            while (scan.hasNext()) {
                String unalinea = scan.nextLine();
                this.getContenido().add(unalinea);
            }

            this.getContenido().remove(0);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getContenido() {
        return contenido;
    }

    public void setContenido(ArrayList<String> contenido) {
        this.contenido = contenido;
    }
    
    
    
    
    
}
