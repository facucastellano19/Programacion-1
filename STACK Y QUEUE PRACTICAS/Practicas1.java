package practicas1;


import java.util.Scanner;

public class Practicas1 {

    public static void main(String[] args) {
//
//        VerificarFormula VF = new VerificarFormula();
//
//        Scanner sc = new Scanner(System.in);
//
//        boolean continuar;
//
//        while (continuar = true) {
//            System.out.println("Ingrese una formula para verificar si es valida");
//            String formula = sc.nextLine();
//
//            System.out.println("La formula es valida? " + VF.esExpresionValida(formula));
//
//            System.out.println("Desea chequear otra formula? Escribe Si/No");
//            String respuesta = sc.nextLine();
//            if (respuesta.equalsIgnoreCase("no")) {
//                break;
//            }
//
//        }

//        VerificarPalindromo vp = new VerificarPalindromo();
//        
//
//        while (true) {
//            System.out.println("Ingrese una palabra para chequear si es palindromo");
//            String palabra = sc.nextLine();
//
//            System.out.println("Es palindromo? " + vp.esPalindromo(palabra));
//
//            System.out.println("Desea chequear otra palabra? Escribe Si/No");
//            String respuesta = sc.nextLine();
//            if (respuesta.equalsIgnoreCase("no")) {
//                break;
//            }
//
//        }       
//        
//        FraseAlReves fr = new FraseAlReves();
//
//        while (true) {
//            System.out.println("Ingrese una palabra para invertirla");
//            String palabra = sc.nextLine();
//
//            System.out.println(fr.Invertida(palabra));
//
//            System.out.println("Desea invertir otra palabra? Escribe Si/No");
//            String respuesta = sc.nextLine();
//            if (respuesta.equalsIgnoreCase("no")) {
//                break;
//            }
//
//        }           
//  
//        HistorialNavegador navegador = new HistorialNavegador();
//        
//        navegador.visitarPagina("https://pagina1.com");
//        navegador.visitarPagina("https://pagina2.com");
//        navegador.visitarPagina("https://pagina3.com");
//        
//        navegador.retroceder(); // Debería retroceder a https://pagina2.com
//        navegador.retroceder(); // Debería retroceder a https://pagina1.com
//
//        navegador.avanzar(); // Debería avanzar a https://pagina2.com
//        navegador.avanzar(); // Debería avanzar a https://pagina3.com
//
//        navegador.visitarPagina("https://pagina4.com"); // Limpiará el avance disponible
//        navegador.avanzar(); // No debería permitir avanzar

        ColaBanco banco = new ColaBanco();
        banco.agregarCliente("Juan");
        banco.agregarCliente("María");
        banco.agregarCliente("Pedro");

        banco.atenderCliente();
        banco.atenderCliente();
        banco.atenderCliente();
        banco.atenderCliente(); // Para probar el caso sin clientes

//        JuegoDeTurno juego = new JuegoDeTurno();
//        juego.agregarJugador("Alice");
//        juego.agregarJugador("Bob");
//        juego.agregarJugador("Charlie");
//
//        juego.realizarTurno();
//        juego.realizarTurno();
//        juego.realizarTurno();     





    }

}
