package ej205;

import java.util.Scanner;


public class Menu {

    private String nombre;
    private int edad;
    private String calle;
    private int altura;

    
    public void ingreso() {
        Scanner entrada = new Scanner(System.in);
        
        this.nombre = pedirTexto(entrada, "Ingrese su nombre (para terminar escriba *)");
        if (salida(nombre)) return;
        
        this.edad = pedirNumero(entrada, "Ingrese su edad (para terminar escriba *)");
        if (edad == -1) return;
        
        this.calle = pedirTexto(entrada, "Ingrese la calle de su domicilio (para terminar escriba *)*");
        if (salida(calle)) return;
        
        this.altura = pedirNumero(entrada, "Ingrese la altura de su domicilio (para terminar escriba *)");
        if (altura == -1) return;
        
        mostrarDatos();
    } 
    
    private int pedirNumero(Scanner sc, String mensaje) {
        while (true) {
            System.out.println(mensaje);
            String num = sc.nextLine();
            if (num.equals("*")){
                return -1;
            }
            
            try {
                return Integer.parseInt(num);
            } catch (NumberFormatException e) {
                System.out.println("Se tiene que ingresar un numero valido");
            }
        }
    }
    
    private String pedirTexto(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        return sc.nextLine();
    }
    
    private boolean salida(String salir) {
        return salir.equals("*"); 
    }
    
    private void mostrarDatos() {
        System.out.println("Los datos fueron ingresados correctamente:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calle: " + calle);
        System.out.println("Altura: " + altura);
    }
    

    
}
