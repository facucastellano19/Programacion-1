
package ej201;

//201 – Realizar una implementación en lenguaje java de un TAD (clase Java) que represente el 
//CUIT/CUIL usado en Argentina. Internamente debe guardarse el dato en una variable de tipo String. 
//También implementar los siguientes métodos:
//-Metodos get y set de la variable interna
//-Un método que devuelva el CUIT formateado de esta forma: AA-BBBBBBBB-C
//-Un método que verifique la cantidad de 11 dígitos de largo.
//Realizar un código de ejemplo, que pida los dígitos de un CUIT, e imprima el mismo formateado en 
//consola, usando el formateo la clase anterior construida.
    
public class CuitCuil {
    
    private String cuit;
    private int LARGO_CUIT = 11;
    private boolean isValid = false;
    
    
    public String getCuitFormato(){                  
        String formato = "";  
        if (!this.isValid) {
            return formato;
        }  
        String elCuit = this.cuit;
        formato = elCuit.substring(0, 2).concat("-").concat(elCuit.substring(2, 10).concat("-").concat(elCuit.substring(10)));
         
        return formato;    
    } 
    
    public void setCuit(String nuevo_cuit){
      
        this.cuit = "";
        
        if (nuevo_cuit.length() != this.LARGO_CUIT) {
            System.out.println("Largo de dato es incorrecto!");
            return;
        }
        
        this.cuit = nuevo_cuit;    
        this.isValid = true;
    }
    
    public String getCuit(){
        return this.cuit;
    }    
    
    
    
    
    
}
