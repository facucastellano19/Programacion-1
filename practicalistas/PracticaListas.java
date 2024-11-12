
package practicalistas;

import java.util.Scanner;


public class PracticaListas {


    public static void main(String[] args) {
        
        //clases compra y registrodecompras
        RegistroDeCompras registro = new RegistroDeCompras();
        
        registro.agregarCompra("Manzanas", 2.50);
        registro.agregarCompra("Pan", 1.20);
        registro.agregarCompra("Leche", 0.80);

        registro.mostrarCompras();
        registro.eliminarCompra(1);
        registro.mostrarCompras();        
        
        // Clases Contacto y Agenda
        Agenda agenda = new Agenda();
        agenda.agregarContacto("Juan", "123456789");
        agenda.agregarContacto("María", "987654321");
        agenda.agregarContacto("Pedro", "456789123");

        agenda.mostrarContactos();
        agenda.eliminarContacto(1);
        agenda.mostrarContactos();    
        
        //Clase GestionListaDeTareas
        GestionListaDeTareas gestionTareas = new GestionListaDeTareas();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\nOpciones: [agregar, eliminar, mostrar, salir]");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "agregar":
                    System.out.print("Ingrese la tarea: ");
                    String tarea = scanner.nextLine();
                    gestionTareas.agregarTarea(tarea);
                    break;
                case "eliminar":
                    System.out.print("Ingrese el indice de la tarea a eliminar: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    gestionTareas.eliminarTarea(indice);
                    break;
                case "mostrar":
                    gestionTareas.mostrarTareas();
                    break;
                case "salir":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (!opcion.equals("salir"));        
        
        
        
    }
    
}
