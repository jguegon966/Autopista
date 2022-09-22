package tickets;

/**
 * Clase ticket especial que hereda los metodos de la clase padre ticket y los sobreescribe
 * @author Chechu
 *
 */
public class TicketEspecial extends Ticket
{
	
	public int kmtotales;
	public int tarifa;
	public int porcentaje;
	public int reduccion;
	public int personas;
	
	/**
	 * Constructor por defecto ticket especial
	 */
	public TicketEspecial() 
	{
		
		super();
		
	}

	/**
	 * Constructor al que se le pasan por parametros los kilometros iniciales y las personas que habrá en el autobus
	 * @param kmInicial kilometros donde empieza la autopista
	 * @param personas personas que hay dentro del autobus
	 */
	public TicketEspecial(int kmInicial, int personas) 
	{
		
		super(kmInicial);
		
	}

	/**
	 * Metodo registro inicial que sirve para mostrar un ticket de donde empieza la autopista
	 */
	@Override
	public void registroInicial()
	{
		
		System.out.println("Introduzca el kilometro al que llego a la autopista el autobus: ");
		kmInicial = scanner.nextInt();
		
		System.out.println("Ticket inicial [km_inicial=" + kmInicial + ", precioKm=" + precioKm + "$]");
		
	}

	/**
	 * Metodo registro final al que se le pasan los kilometros de salida y aplica el porcentaje para la tarifa teniendo en cuenta las personas
	 */
	@Override
	public void registroFinal(int kmSalida) 
	{
		
		System.out.println("Introduce la cantidad de pasajeros dela autobus: ");
		
		this.personas = scanner.nextInt();
		
		this.kmtotales = Math.abs(kmSalida - kmInicial);
		
		this.tarifa = this.kmtotales * this.precioKm * this.personas;
		
		if (this.kmtotales >= 100)
		{
			
			this.reduccion = tarifa * 5 / 100;
			
			this.tarifa = tarifa - reduccion;
			
		}

		System.out.println("Ticket final Especial[kmTotales=" + kmtotales + ", Tarifa=" + tarifa + "$, pasajeros= " + personas + "]");
		
		
	}

}
