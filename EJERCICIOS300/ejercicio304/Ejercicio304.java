
package ejercicio304;
import java.util.Scanner;

public class Ejercicio304 {
    
//304 - Escriba un programa Java para crear una clase abstracta Figura con los métodos abstractos 
//calcularArea() y calcularPerimetro(). Crear las subclases Circulo y Triangulo que extiendan la clase 
//Figura e implementen los métodos respectivos para calcular el área y el perímetro de cada forma.

    public static void main(String[] args) {
        Ejercicio triangulouno = new Triangulo();
        Ejercicio circulouno = new Circulo();
        Scanner entrada = new Scanner(System.in);
        
        int eleccion;
        System.out.println("Triangulo (1) o Circulo (2): ");
        eleccion = entrada.nextInt();
        if (eleccion == 1) {
            triangulouno.calcularArea();
            triangulouno.calcularPerimetro();
        } else if (eleccion == 2) {
            circulouno.calcularArea();
            circulouno.calcularPerimetro();
        } else {
            System.out.println("Error.");
        }
    }
    
}
