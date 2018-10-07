package Interpreter;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		Expresion expresionConsulta = null;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzcas su consulta: ");
		String consulta = reader.nextLine();
		
		try
		{
			expresionConsulta = Expresion.analiza(consulta);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			expresionConsulta = null;
		}
		if(expresionConsulta != null)
		{
			System.out.println("Introduzca la descripcion de un vehículo: ");
			String descripcion = reader.nextLine();
			if(expresionConsulta.evalua(descripcion))
				System.out.println("La descripción responde a la consulta");
			else
				System.out.println("La descripción no responde a la consulta");
		}
	}

}
