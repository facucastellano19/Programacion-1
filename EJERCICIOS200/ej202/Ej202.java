
package ej202;


public class Ej202 {


    public static void main(String[] args) {

        ProcesoColores proceso = new ProcesoColores();    
        String rutaArchivo = "C:/temporal/e202.txt";

        proceso.leerColoresDesdeArchivo(rutaArchivo);
        proceso.validarColoresUsuario();
    }
    
}
