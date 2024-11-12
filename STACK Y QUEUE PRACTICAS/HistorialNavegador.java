package practicas1;

import java.util.Stack;

public class HistorialNavegador {

    private Stack<String> historial = new Stack<>();
    private Stack<String> adelante = new Stack<>();

    public void visitarPagina(String url) {
        historial.push(url);
        adelante.clear(); // Limpiar pila de "adelante" al visitar una nueva página
        System.out.println("Visitando: " + url);
    }

    public void retroceder() {
        // Verificamos si la pila `historial` no está vacía.
        // Esto asegura que haya páginas a las que podamos retroceder.
        if (!historial.isEmpty()) {

            // Quitamos la última página visitada del historial con `pop()` 
            // y la agregamos a la pila `adelante` para que podamos "avanzar" a ella después.
            adelante.push(historial.pop());

            // Verificamos si `historial` quedó vacío después de hacer `pop()`.
            if (historial.isEmpty()) {
                // Si `historial` está vacío, significa que hemos retrocedido hasta el inicio.
                System.out.println("Retrocediendo a: Inicio");
            } else {
                // Si aún hay páginas en `historial`, mostramos la página actual
                // usando `historial.peek()`, que da la página en la cima de la pila.
                System.out.println("Retrocediendo a: " + historial.peek());
            }

        } else {
            // Si `historial` estaba vacío desde el inicio,
            // mostramos un mensaje indicando que no hay más páginas para retroceder.
            System.out.println("No hay historial para retroceder.");
        }
    }

    public void avanzar() {
        if (!adelante.isEmpty()) {
            historial.push(adelante.pop());
            System.out.println("Avanzando a: " + historial.peek());
        } else {
            System.out.println("No hay páginas adelante.");
        }
    }
    
    
//    osea si tengo 3 paginas, y retrocedo 2, quedaria en la pagina 1, entonces en la pila "adelante" van a estar apiladas las paginas 2 y 3 que retrocedi,          
//    entonces cuando quiera avanzar usando el metodo avanzar, tendria que mostrarme la pagina 2, que esta en la cima de "adelante".
}
