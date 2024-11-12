package ejercicio_e501;

public class Burbuja {

    public void ordenaVector() {

        int vec[] = {6, 8, 3, 5, 4, 9, 0, 2, 1, 7};
        System.out.print("Vector sin ordenar: ");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
        //Ordenamiento
        for (int i = 0; i < vec.length - 1; i++) {
            for (int j = 0; j < (vec.length - 1 - i); j++) {
                if (vec[j] > vec[j + 1]) {
                    int aux = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = aux;
                }
            }
        }
        System.out.print("\nVector ordenado: ");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }

    }

    public Alumno[] ordenPorDni( Alumno[] arentra ) {
        
        // alumno[] arsalida = new alumno[arentra.length];
        
        for (int i = 0; i < arentra.length - 1; i++) {
            for (int j = 0; j < (arentra.length - 1 - i); j++) {
                Alumno a1 = arentra[j];
                Alumno a2 = arentra[j + 1];                        
                if (a1.getDni() > a2.getDni()) {
                    Alumno aux = arentra[j];
                    arentra[j] = arentra[j + 1];
                    arentra[j + 1] = aux;
                }
            }
        }
        
        return arentra;
        
    }
}