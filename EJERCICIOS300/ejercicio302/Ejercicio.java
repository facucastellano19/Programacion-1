import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio {

    public void procesoEntero() {
        // Formato de la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Variables para las fechas
        String fechahoy;
        String fechacumple;

        // Scanner para leer las fechas del usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar la fecha de hoy: ");
        fechahoy = entrada.nextLine();
        System.out.println("Ingresar la fecha del siguiente cumpleaños: ");
        fechacumple = entrada.nextLine();

        try {
            // Parseamos las fechas
            LocalDate hoy = LocalDate.parse(fechahoy, formatter);
            LocalDate cumple = LocalDate.parse(fechacumple, formatter);

            // Calculamos la diferencia en días
            long dias = ChronoUnit.DAYS.between(hoy, cumple);

            // Imprimimos el resultado
            System.out.println("Faltan " + dias + " días para el próximo cumpleaños.");

        } catch (Exception e) {
            System.out.println("Error con el formato de fecha.");
            e.printStackTrace();
        }
    }
}
