package servicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Clase la cual contiene la logica de los metodos de fichero
 */
public class ficheroImplementacion implements ficheroInterfaz {

	@Override
	public void ficheroLog(String dato) {
		try {

			
			  LocalDate fechaHoyDateTime= LocalDate.now();
			  
			  
			  
			 SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
			  
			 //String fechaFormateada = formato.format(fechaHoyDateTime);
			String fechaHoy="08-05-2024";
			String ruta = "C:\\Users\\csi23-iloposa\\Desktop\\log-"+fechaHoy+".txt";

			BufferedWriter escribe = new BufferedWriter(new FileWriter(ruta, true));
			escribe.write(dato + "\n");
			escribe.close();
		} catch (Exception e) {
			System.out.println("Ocurrio un error en el fichero log");
		}

	}

	@Override
	public void ficheroCitas() {
		try {
		String diafechaCita = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba la fecha a consultar (dd-MM-yyyy)");
		String fecha = sc.next();

		
	} catch (Exception e) {
		System.out.println("Ocurrio un error en el fichero citas");
	}
	}

}