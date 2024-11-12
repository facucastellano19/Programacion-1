package practicas1;

import java.util.LinkedList;
import java.util.Queue;

public class JuegoDeTurno {

    private Queue<String> colaJugadores;

    public JuegoDeTurno() {
        colaJugadores = new LinkedList<>();
    }

    public void agregarJugador(String jugador) {
        colaJugadores.add(jugador);
        System.out.println("Jugador agregado: " + jugador);
    }

    public void realizarTurno() {
        if (!colaJugadores.isEmpty()) {
            String jugadorActual = colaJugadores.poll(); // Elimina y retorna el jugador en la parte frontal
            System.out.println("Turno de: " + jugadorActual);
            
            // Mover al jugador al final de la cola
            colaJugadores.add(jugadorActual);
        } else {
            System.out.println("No hay jugadores en la cola.");
        }
    }

}
