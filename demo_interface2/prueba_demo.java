package demo_interface2;

import java.util.ArrayList;

public class prueba_demo {

    public void menu() {

        ArrayList<SeleccionFutbol> integrantes = new ArrayList();

        SeleccionFutbol delBosque = new Entrenador(1, 28489, "Vicente", "Del Bosque", 60);
        SeleccionFutbol iniesta = new Futbolista(6, "Interior Derecho", 2, "Andres", "Iniesta", 29);
        SeleccionFutbol raulMartinez = new Masajista("Licenciado en Fisioterapia", 18, 3, "Raúl", "Martinez", 41);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.concentrarse();

        }
        
        System.out.println(""); 
        
        // VIAJE
        System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.viajar();
        }
        
        System.out.println("");
        
        // ENTRENAMIENTO
        System.out.println("Entrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.entrenar();
        }
        
        System.out.println("");
        
        // PARTIDO DE FUTBOL
        System.out.println("nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.jugarPartido();
        }
        System.out.println("");

        // PLANIFICAR ENTRENAMIENTO
        System.out.println("nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
        System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
        ((Entrenador) delBosque).planificarEntrenamiento();
        
        // ENTREVISTA
        System.out.println("nEntrevista: Solo el futbolista tiene el método para dar una  entrevista:");
        System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
        ((Futbolista) iniesta).entrevista();

        // MASAJE
        System.out.println("nMasaje: Solo el masajista tiene el método para dar un masaje:");
        System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
        ((Masajista) raulMartinez).darMasaje();

    }
}
