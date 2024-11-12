package ejercicio_e501;

import java.util.ArrayList;


public class Ejercicio {
    
    public Alumno[] grupo;
    
    public void menu(){
        
        this.entrada();
        this.proceso();
        this.salida();
        
    }
    
    public void entrada(){
        Archivo ar = new Archivo();
        ar.leer_archivo();
        Integer largo = ar.getContenido().size();
        
        if (largo <= 0) {
            System.out.println("Error en cantenido");
            return;
        }
        
        grupo = new Alumno[largo];
        int indice = 0;
        
        for (String linea : ar.getContenido()) {
            String[] partes = linea.split(",");
            Alumno alumnox = new Alumno();
            alumnox.setPuesto(Integer.valueOf(partes[0]));
            alumnox.setApellido(partes[1]);
            alumnox.setNombre(partes[2]);
            alumnox.setDni(Long.valueOf(partes[3]));
            alumnox.setPuntaje(Integer.valueOf(partes[4]));
            
            grupo[indice] = alumnox;
            indice++;
            
            
            
            
        }
    }
    
    public void proceso(){
        
        
        Burbuja bur = new Burbuja();
        grupo = bur.ordenPorDni(grupo);
        
        
        
    }
    
    public void salida(){
        for (int i = 0; i < grupo.length; i++) {
            Alumno alx = this.grupo[i];
            System.out.println(alx.toString());
        }
    }    
    
}
