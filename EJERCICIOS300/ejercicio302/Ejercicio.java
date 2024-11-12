// Luca Ferrante
package ejercicio302;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Ejercicio {
    
    public void procesoEntero() {
        DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        String fechahoy = "";
        String fechacumple = "";
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar la fecha de hoy: ");
        fechahoy = entrada.nextLine();
        System.out.println("Ingresar la fecha del siguiente cumpleaños: ");
        fechacumple = entrada.nextLine();
        
        try {
            Date datehoy = formateador.parse(fechahoy);
            Date datecumple = formateador.parse(fechacumple);
            
            Calendar calendariohoy = new GregorianCalendar();
            Calendar calendariocumple = new GregorianCalendar();
            
            calendariohoy.setTime(datehoy);
            calendariocumple.setTime(datecumple);
            
            long dias = (calendariocumple.getTimeInMillis() - calendariohoy.getTimeInMillis()) / (1000 * 60 * 60 * 24);

            System.out.println("Faltan " + dias + " dias para el proximo cumpleaños.");
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
