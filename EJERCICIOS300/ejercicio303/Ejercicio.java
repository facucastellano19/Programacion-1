// Luca Ferrante
package ejercicio303;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio {
    Scanner entrada = new Scanner(System.in);
    enum Dias {Domingo, Lunes, Martes, Miercoles, Jueves, Viernes, Sabado};
    int numingresado;
    
    public void procesoTotal() {
        try {
            System.out.println("Ingresar numero del 1 al 7: ");
            numingresado = entrada.nextInt();
            
            if (numingresado >= 1 && numingresado <= 7) {
                Dias dia = Dias.values()[numingresado - 1];
                System.out.println("Dia: " + dia);
            }
            else {
                System.out.println("Numero invalido.");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Error. Ingresa un numero entero.");
            e.printStackTrace();
        }
    }
}