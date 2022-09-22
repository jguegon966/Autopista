package main;

import java.util.Scanner;

import tickets.Ticket;
import tickets.TicketEspecial;
import tickets.TicketGeneral;

/**
 * Clase Main que nos servirá para lanzar la aplicacion
 * @author Chechu
 *
 */
public class Main 
{
	/**
	 * Metodo main que nos va a servir para lanzar la aplicacion
	 * @param args argumentos que se realizan dentro del metodo
	 */
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner (System.in);
	
		/**
		 * Se generan los tickets llamando a su correspondiente clase segun el tipo de vehiculo
		 */
		Ticket ticketCoches = new TicketGeneral();
		Ticket ticketBuses = new TicketEspecial();
		
		/**
		 * llamada al metodo registro inicial del ticket general
		 */
		ticketCoches.registroInicial();
		
		System.out.println("Introduce La distancia en la que salio de la autopista el coche: ");
		
		int salidaCoches = scanner.nextInt();
		
		/**
		 * llamada al metodo registro final del ticket general
		 */
		ticketCoches.registroFinal(salidaCoches);
		
		/**
		 * llamada al metodo registro inicial del ticket especial
		 */
		ticketBuses.registroInicial();
		
		System.out.println("Introduce La distancia en la que salio de la autopista el autobus: ");
		
		int salidaBuses = scanner.nextInt();
		
		/**
		 * llamada al registro final del ticket especial
		 */
		ticketBuses.registroFinal(salidaBuses);
		
	}
	
}
