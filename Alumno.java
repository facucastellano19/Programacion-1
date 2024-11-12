
package ejercicio_e501;


public class Alumno {
    
    Integer puesto;
    String nombre;
    String apellido;
    Long dni;
    Integer puntaje;

    public Integer getPuesto() {
        return puesto;
    }

    public void setPuesto(Integer puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Alumno{" + "puesto=" + puesto + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", puntaje=" + puntaje + '}';
    }
    
    
}
