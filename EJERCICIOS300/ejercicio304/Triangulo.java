// Luca Ferrante
package ejercicio304;
import java.util.Scanner;

public class Triangulo extends Ejercicio {
    Scanner entrada = new Scanner (System.in);
    int longitud;
    int anchura;
    int lado1;
    int lado2;
    int lado3;
    
    @Override
    public void calcularArea() {
        System.out.println("Ingresar la longitud: ");
        longitud = entrada.nextInt();
        
        System.out.println("Ingresar la anchura: ");
        anchura = entrada.nextInt();
        
        System.out.println("El area es: " + longitud * anchura);
    }
    
    @Override
    public void calcularPerimetro() {
        System.out.println("Ingresar primer lado: ");
        lado1 = entrada.nextInt();
        
        System.out.println("Ingresar segundo lado: ");
        lado2 = entrada.nextInt();
        
        System.out.println("Ingresar tercer lado: ");
        lado3 = entrada.nextInt();
        
        System.out.println("El perimetro es: " + (lado1 + lado2 + lado3));
    }
}