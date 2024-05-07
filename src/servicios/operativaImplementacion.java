package servicios;

import java.util.Scanner;

import controladores.inicio;
import dtos.clienteDto;

public class operativaImplementacion implements operativaInterfaz {

	Scanner sc = new Scanner(System.in);

	@Override
	public void validarNuevoCliente() {
		System.out.println("Listado de clientes ");
		for (clienteDto cliente : inicio.listaClientes) {
			
			if (cliente.getValidacionCliente() == false) {

				System.out.println(cliente.getDni() + " - " + cliente.getNombre() );

				
			}
			

		}
		for (clienteDto cliente2 : inicio.listaClientes) {
			
			System.out.println("Introduzca el DNI del cliente a validar");
			String dniString = sc.next();
			if (dniString.equals(cliente2.getDni())) {
				cliente2.setValidacionCliente(true);
			}
				
			break;}
			
		}
		

			
		

	

	@Override
	public void imprimirCitasMedicas() {
		

	}

	@Override
	public void registroCliente() {
		long id = generarIDAutomaticoPedidos();
		System.out.println("Introduzca su DNI");
		String dni = sc.next();
		System.out.println("Introduzca su nombre");
		String nombre = sc.next();
		System.out.println("Introduzca su apellidos (Juntos)");
		String apellido = sc.next();
		clienteDto cliente = new clienteDto(id, dni, nombre, apellido);
		inicio.listaClientes.add(cliente);
	}

	@Override
	public void solicitudCita() {
		// TODO Apéndice de método generado automáticamente

	}

	/**
	 * Metodo encargado para la autogeneracion de un id
	 * 
	 * @return
	 */
	private long generarIDAutomaticoPedidos() {
		long id;

		if (inicio.listaClientes.size() == 0) {
			id = 1;
		} else {
			int posicion = inicio.listaClientes.size() - 1;
			long nuevoId = inicio.listaClientes.get(posicion).getId() + 1;
			id = nuevoId;
		}
		return id;
	}

}
