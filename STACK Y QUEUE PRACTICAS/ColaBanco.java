package practicas1;

import java.util.LinkedList;
import java.util.Queue;


public class ColaBanco {
    
    private Queue<String> colaClientes;

    public ColaBanco() {
        colaClientes = new LinkedList<>();
    }

    public void agregarCliente(String cliente) {
        colaClientes.add(cliente);
        System.out.println("Cliente en cola: " + cliente);
    }

    public void atenderCliente() {
        if (!colaClientes.isEmpty()) {
            String clienteAtendido = colaClientes.poll(); // Elimina y retorna el cliente en la parte frontal
            System.out.println("Atendiendo cliente: " + clienteAtendido);
        } else {
            System.out.println("No hay clientes en la cola.");
        }
    }    
    
    
    
}
