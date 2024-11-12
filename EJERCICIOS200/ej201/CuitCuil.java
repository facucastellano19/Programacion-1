
package ej201;


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
