package tickets;

/**
 * Clase Ticket general que hereda los metodos de la clase padre Ticket y los sobreescribe 
 * @author Chechu
 *
 */
public class TicketGeneral extends Ticket {
	
	public int kmtotales;
	public int tarifa;
	public int porcentaje;
	public int reduccion;

	/**
	 * Constructor por defecto de la clase ticket general
	 */
	public TicketGeneral() 
	{
		super();
	}

	/*
	 * Constructo ticket general al que se le pasa por parametro el km inicial que hereda de la clase padre
	 */
	public TicketGeneral(int kmInicial) 
	{
		super(kmInicial);
	}
	
	/**
	 * Metodo registro inicial que sirve para mostrar un ticket de donde empieza la autopista
	 */
	@Override
	public void registroInicial()
	{
		
		System.out.println("Introduzca el kilometro al que llego a la autopista el coche: ");
		kmInicial = scanner.nextInt();
		
		System.out.println("Ticket inicial [km_inicial=" + kmInicial + ", precioKm=" + precioKm + "$]");
		
	}
	
	/**
	 * Metodo registro final que nos servirá para hacer el calculo y mostrar la tarifa a pagar por el peaje en un vehiculo normal
	 */
	@Override
	public void registroFinal(int kmSalida) 
	{
		
		this.kmtotales = Math.abs(kmSalida - kmInicial);
		
		this.tarifa = this.kmtotales * precioKm;
		
		if (this.kmtotales >= 500)
		{
			
			this.reduccion = tarifa * 10 / 100;
			
			this.tarifa = tarifa - reduccion;
			
		}

		System.out.println("Ticket final General[kmTotales=" + kmtotales + ", Tarifa=" + tarifa + "$]");
		
	}
	
}
