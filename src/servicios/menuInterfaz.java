package servicios;

/**
 * Clase la cual contiene las cabeceras de los metodos encargados del menu principal
 */
public interface menuInterfaz {

	/**
	 * Metodo encargado de mostrar el menu principal 
	 * @return
	 */
	public int mostrarMenuPrincipal();
	/**
	 * Metodo encargado de mostrar el menu empleado 
	 * @return
	 */
	public void mostrarMenuEmpleado ();
	/**
	 * Metodo encargado de mostrar el menu cliente 
	 * @return
	 */
	public void mostrarMenuCliente();
	/**
	 * Metodo encargado de consultar las citas 
	 * @return
	 */
	public void consultarCita();
}
