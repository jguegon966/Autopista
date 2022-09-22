package interfaz;

/**
 * Interfaz de ticket de la cual se cogerán los metodos de dicha interfaz 
 * @author Chechu
 *
 */
public interface ITicket {
	
	/**
	 * Metodo para generar un ticket con el registro inicial
	 */
	void registroInicial();
	
	/**
	 * Metodo para general el ticket con el registro final al que se le pasan los kilometros con los que sale de la autopista
	 * @param km_salida kilometros con los que se sale de la autopista
	 */
	void registroFinal(int km_salida);

}
