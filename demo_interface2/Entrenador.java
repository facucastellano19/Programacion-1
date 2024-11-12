
package demo_interface2;

public class Entrenador extends SeleccionFutbol {

    private int idFederacion;

    // Constructor, getter y setter

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    @Override
    public void entrenar() {
        System.out.println("Dirige un entrenamiento (Clase Entrenador)");

    }

    @Override
    public void jugarPartido() {
        System.out.println("Dirige un Partido (Clase Entrenador)");
    }

    public void planificarEntrenamiento() {
        System.out.println("Planificar un Entrenamiento");
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    

}
