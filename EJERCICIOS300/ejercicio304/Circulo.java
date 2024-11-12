
package ejercicio304;
import java.util.Scanner;

public class Circulo extends Ejercicio {
    public Circulo() {
    }
    
    Scanner entrada = new Scanner(System.in);
    @Override
    public void calcularArea() {
        System.out.println("Ingresar radio de circulo");
        float radio = entrada.nextFloat();
        System.out.println("El area es: " + Math.pow(radio, 2) * 3.141);
    }
    
    @Override
    public void calcularPerimetro() {
        System.out.println("Ingresar radio de circulo: ");
        float radio = entrada.nextFloat();
        System.out.println("El perimetro es: " + (radio * 2) * 3.141);
    }
}
