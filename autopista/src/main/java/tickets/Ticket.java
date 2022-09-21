package tickets;

import java.util.Scanner;

import interfaz.ITicket;

/**
 * Clase abstracta Ticket que implementará la interfaz y será la clase padre de ticket general y especial
 * @author Chechu
 *
 */
public abstract class Ticket implements ITicket {
	
	Scanner scanner = new Scanner (System.in);
	
	public int kmInicial;
	public final int precioKm = 2;
	
	/**
	 * Constructor vacio por defecto
	 */
	public Ticket() 
	{
		
	}
	
	/**
	 * Constructor al que se le pasa por parametros el kilometro donde inicia en la autovia
	 * @param kmInicial kilometros donde empieza la autopista
	 */
	public Ticket(int kmInicial) 
	{
		this.kmInicial = kmInicial;
	}

	/**
	 * Metodo registro inicial que sirve para mostrar un ticket de donde empieza la autopista
	 */
	public void registroInicial()
	{
		
		System.out.println("Introduzca el kilometro al que llegó a la autopista: ");
		kmInicial = scanner.nextInt();
		
		System.out.println("Ticket inicial [km_inicial=" + kmInicial + ", precioKm=" + precioKm + "$]");
		
	}

	/**
	 * Metodo abstracto que se usará en las clases hijas posteriormente
	 */
	public abstract void registroFinal(int kmSalida);
	
	
}
