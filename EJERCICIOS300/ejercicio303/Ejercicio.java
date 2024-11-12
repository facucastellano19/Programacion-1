
package ejercicio303;
import java.util.Scanner;
import java.util.InputMismatchException;

//303 – Realizar un programa en lenguaje java para imprimir en base a un número ingresado de 1 a 7, el
//nombre del día de la semana correspondiente, siendo domingo el numero 1. Usar una estructura Enum
//para guardar la información y recuperarla.

public class Ejercicio {
    
    public void procesoTotal() {
        Scanner entrada = new Scanner(System.in);
        enum Dias {Domingo, Lunes, Martes, Miercoles, Jueves, Viernes, Sabado};
        int numingresado;

        try {
            System.out.println("Ingresar numero del 1 al 7: ");
            numingresado = entrada.nextInt();
            
            if (numingresado >= 1 && numingresado <= 7) {
                Dias dia = Dias.values()[numingresado - 1];
                System.out.println("Día: " + dia.toString().toLowerCase());  // Imprime el nombre del día en minúsculas
            }
            else {
                System.out.println("Número inválido. Ingrese un número entre 1 y 7.");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Error. Ingresa un número entero.");
        } finally {
            entrada.close();  // Cierra el scanner para evitar fuga de recursos
        }
    }
}
