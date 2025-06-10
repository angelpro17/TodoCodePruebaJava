package PruebaTecnicaAnfiteatro;

import logica.Cliente;
import logica.Ticket;
import java.util.*;

public class PruebaTecnicaAnfiteatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //manejo de polimorfismo

        Cliente cliente1 = new Cliente("Luis", "Anampa", 13131);
        Cliente cliente2 = new Cliente("Pedro", "Juenza", 12121231);
        Ticket ticket1 = new Ticket(12,2,3,1500,new Date(),new Date());
        Ticket ticket2 = new Ticket(12,3,4,1500,new Date(),new Date());
        Ticket ticket3 = new Ticket();
        ticket3.setNumero(12);
        ticket3.setFila(2);
        ticket3.setAsiento(5);
        ticket3.setPrecio(1500);
        ticket3.setFechaCompra(new Date());
        ticket3.setFechaValidez(new Date());
        Ticket ticket4 = new Ticket(14,6,1,1400,new Date(),new Date());
        Ticket ticket5 = new Ticket(11,9,2,1200,new Date(),new Date());

        //Agrego elementos ala lista
        cliente1.agregarTicket(ticket1);
        cliente1.agregarTicket(ticket2);
        cliente1.agregarTicket(ticket3);
        System.out.println("-----------------------------------");
        cliente1.mostrarTicket();
        System.out.println("-----------------------------------");
        System.out.println();
        //Agrego elementos ala lista
        cliente2.agregarTicket(ticket3);
        cliente2.agregarTicket(ticket4);
        cliente2.agregarTicket(ticket5);
        System.out.println("-----------------------------------");
        cliente2.mostrarTicket();
        System.out.println("-----------------------------------");




        boolean bandera = true  ;
        while (bandera == true) {
            System.out.println("Ingresa un numero de fila: ");
            int filaABuscar = teclado.nextInt();
            // Buscar y mostrar tickets de la fila especificada
            cliente1.mostrarTicketsPorFila(filaABuscar);
            cliente2.mostrarTicketsPorFila(filaABuscar);
            System.out.println("Desea seguir buscando? S/N : ");
            String respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("N")) {
                bandera = false;
            }
        }
    }
}
