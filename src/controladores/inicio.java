package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.clienteDto;
import servicios.ficheroImplementacion;
import servicios.ficheroInterfaz;
import servicios.menuImplementacion;
import servicios.menuInterfaz;

/**
 * Clase principal de la aplicacion
 */
public class inicio {
	public static List<clienteDto> listaClientes = new ArrayList<clienteDto>();

	/**
	 * Metodo principal de la aplicacion, por la cual se lanzara ella
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		menuInterfaz mi = new menuImplementacion();
		ficheroInterfaz fi = new ficheroImplementacion();
		try {

			boolean cerrarMenu = false;
			int opc;

			while (!cerrarMenu) {
				opc = mi.mostrarMenuPrincipal();

				switch (opc) {
				case 0:
					System.out.println("Selecciono cerrar menu");
					fi.ficheroLog("Selecciono cerrar menu");
					cerrarMenu = true;
					break;
				case 1:
					System.out.println("Selecciono menu empleado");
					fi.ficheroLog("Selecciono menu empleado");
					mi.mostrarMenuEmpleado();
					break;
				case 2:
					System.out.println("Selecciono menu cliente");
					fi.ficheroLog("Selecciono menu cliente");
					mi.mostrarMenuCliente();
					break;
				default:
					System.out.println("Esta opcion no existe");
					fi.ficheroLog("Selecciono Esta opcion no existe");
					break;
				}
			}

		} catch (Exception e) {System.out.println("Ocurrio un error en la aplicacion");
		}

	}
}
