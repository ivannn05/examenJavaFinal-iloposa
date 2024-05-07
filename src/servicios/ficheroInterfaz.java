package servicios;

/**
 * Interfaz encargada de contener las cabeceras de los metodos de fichero
 */
public interface ficheroInterfaz {

	/**
	 * Metodo encargado de generar el fichero log
	 * @param dato
	 */
	public void ficheroLog(String dato);
	/**
	 * Metodo encargado de generar un fichero de las citas
	 */
	public void ficheroCitas();
}
