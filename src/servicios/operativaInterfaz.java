package servicios;

/**
 * Clase interfaz la cual contiene las cabeceras de los metodos del funcionamiento de la aplicacion
 */
public interface operativaInterfaz {

	/**
	 * Metodo encargado para validar un uevo cliente 
	 */
	public void validarNuevoCliente();
	/**
	 * Metodo encargado para imprimir las citas medicas 
	 */
	public void imprimirCitasMedicas();
	
	/**
	 * Metodo encargado para registrar un nuevo cliente  
	 */
	public void registroCliente();
	/**
	 * Metodo encargado para la solicitud de una cita  
	 */
	public void solicitudCita();
}
