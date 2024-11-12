package practicalistas;

import java.util.ArrayList;
import java.util.List;


public class GestionListaDeTareas {
    
    private List<String> tareas;

    public GestionListaDeTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("Tarea agregada: " + tarea);
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            String tareaEliminada = tareas.remove(indice);
            System.out.println("Tarea eliminada: " + tareaEliminada);
        } else {
            System.out.println("Indice inválido.");
        }
    }

    public void mostrarTareas() {
        System.out.println("Lista de tareas:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println(i + ": " + tareas.get(i));
        }
    }    
    
    
}
