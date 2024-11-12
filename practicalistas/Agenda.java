
package practicalistas;

import java.util.ArrayList;
import java.util.List;


public class Agenda {
    
    private List<Contacto> contactos = new ArrayList<>(); // Instanciación fuera del constructor

    public void agregarContacto(String nombre, String telefono) {
        contactos.add(new Contacto(nombre, telefono));
        System.out.println("Contacto agregado: " + nombre);
    }

    public void eliminarContacto(int indice) {
        if (indice >= 0 && indice < contactos.size()) {
            Contacto contactoEliminado = contactos.remove(indice);
            System.out.println("Contacto eliminado: " + contactoEliminado);
        } else {
            System.out.println("Indice invalido.");
        }
    }

    public void mostrarContactos() {
        System.out.println("Lista de contactos:");
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println(i + ": " + contactos.get(i));
        }
    }    
}
