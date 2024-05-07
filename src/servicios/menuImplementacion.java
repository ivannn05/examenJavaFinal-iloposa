package servicios;

import java.util.Scanner;

/**
 * Clase encargada de contener la logica de los metodos del menu
 */
public class menuImplementacion implements menuInterfaz {

	operativaInterfaz op= new operativaImplementacion();
	ficheroInterfaz fi=new  ficheroImplementacion();
	Scanner sc= new Scanner(System.in);
	String mensaje;
	@Override
	public void mostrarMenuCliente() {
		try {
			
		
		boolean cerrarMenu = false;
		int opc=0;

		while(!cerrarMenu)
		{
			System.out.println("Seleccione una opcion");
			System.out.println("0.Cerra menu");
			System.out.println("1.Registro de cliente");
			System.out.println("2.Solicitud cita medica");
			System.out.println("3.Consultar citas medicas");
			opc=sc.nextInt();
			switch (opc) {
			case 0:
	System.out.println("Selecciono cerrar menu cliente");
	cerrarMenu=true;
	
	fi.ficheroLog("Selecciono cerrar menu cliente");
				break;
			case 1:
				System.out.println("Selecciono registro cliente");
				 
				fi.ficheroLog("Selecciono registro cliente");
				op.registroCliente();
				break;
			case 2:
				System.out.println("Selecciono solicitud cita");
				 op.solicitudCita();
				fi.ficheroLog("Selecciono solicitud cita");
				break;
			case 3:
				System.out.println("Selecciono Consultar citas medicas");
				
				 op.solicitudCita();
				fi.ficheroLog("Selecciono Consultar citas medicas");
				
				break;
			default:
				System.out.println("Esta opcion no existe");
				break;
			}
		}
		} catch (Exception e) {
			System.out.println("Ocurrio un error en el menu ");
		}
	}

	@Override
	public void mostrarMenuEmpleado()  {
		try {
			
		
		boolean cerrarMenu = false;
		int opc;

		while(!cerrarMenu)
		{
			System.out.println("Seleccione una opcion");
			System.out.println("0.Cerra menu");
			System.out.println("1.Validar nuevo cliente");
			System.out.println("2.Imprimir citas por un dia");
			opc=sc.nextInt();
			switch (opc) {
			case 0:
	System.out.println("Selecciono cerrar menu empleado");
	cerrarMenu=true;
	 
	fi.ficheroLog("Selecciono cerrar menu empleado");
				break;
			case 1:
				System.out.println("Selecciono Validar nuevo cliente");
				
				fi.ficheroLog("Selecciono Validar nuevo cliente");
				op.validarNuevoCliente();
				break;
			case 2:
				System.out.println("Selecciono Imprimir citas por un dia");
				op.imprimirCitasMedicas();
				
				fi.ficheroLog("Selecciono Imprimir citas por un dia");
				break;
			default:
				System.out.println("Esta opcion no existe");
				break;
			}
		}
		} catch (Exception e) {
			System.out.println("Ocurrio un error en el menu empleado");
		}

	}

	@Override
	public int mostrarMenuPrincipal() {
		
			System.out.println("Seleccione una opcion");
			System.out.println("0.Cerra menu");
			System.out.println("1.Menu enmpleado");
			System.out.println("2.Menu cliente");
			int opc;
			opc=sc.nextInt();
			return opc;
	}

	@Override
	public void consultarCita() {
		// TODO Apéndice de método generado automáticamente
		
	}

}
