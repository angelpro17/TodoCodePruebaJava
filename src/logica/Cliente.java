package logica;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nombreC;
    private String apellidoC;
    private int DNI;
    private List<Ticket> tickets;
    public static int contador;

    public Cliente(String nombreC, String apellidoC, int DNI){
        this.tickets = new ArrayList<Ticket>();
        this.idCliente = ++contador;
        this.nombreC = nombreC;
        this.apellidoC = apellidoC;
        this.DNI = DNI;

    }

    public void agregarTicket(Ticket ticket){
        this.tickets.add(ticket);

    }
    public double calcularPrecio(){
        double total = 0 ;
        for (Ticket t: tickets){
            total = total + t.getPrecio();
        }
        return total;
    }

    public void mostrarTicket(){
        System.out.println("ID del cliente: "+idCliente);
        System.out.println("Nombre del cliente: "+nombreC+" "+apellidoC);
        System.out.println("DNI del cliente: "+DNI);
        System.out.println("Total a pagar: "+calcularPrecio());
        System.out.println("Productos de la orden: ");
        for(Ticket t: tickets){
            System.out.println(t);
        }
    }

    public void mostrarTicketsPorFila(int filaABuscar){
        boolean bandera = false;
        for(Ticket t: tickets){
            if(t.getFila() == filaABuscar){
                System.out.println(t);
                bandera = true;
            }
        }
        if(!bandera){
            System.out.println("No hay tickets en la fila especificada");
        }

    }
}
