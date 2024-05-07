package dtos;

import java.time.LocalDateTime;
/**
 * Clase la cual contiene los campos de los clientes 
 */
public class clienteDto {
//campos
	long id;
	String dni = "aaaa";
	String nombre = "aaaa";
	String apellido = "aaaa";
	boolean validacionCliente = false;
	LocalDateTime instanteRegistro=LocalDateTime.now();
	//constructores
	public clienteDto(long id, String dni, String nombre, String apellido) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = apellido + ", " + nombre;
		this.apellido = apellido;

	}
	
	public clienteDto() {
		super();
	}
	//Getter y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	

	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean getValidacionCliente() {
		return validacionCliente;
	}

	public void setValidacionCliente(boolean validacionCliente) {
		this.validacionCliente = validacionCliente;
	}

}
