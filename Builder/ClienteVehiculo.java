package Builder;
import java.util.*;

import AbstractFactory.FabricaVehiculoElectricidad;
import AbstractFactory.FabricaVehiculoGasolina;
public class ClienteVehiculo {
	public static void main (String[] args)
	{
		Scanner reader = new Scanner(System.in);
		ConstructorDocumentacionVehiculo constructor = null;
		
		boolean valor=true;
		
		do
		{
		System.out.println("Desea generar "+ "documentacion HTML (1) O PDF (2): ");
		String seleccion = reader.next();

			if(seleccion.equals("1"))
			{
				constructor = new ConstructorDocumentacionVehiculoHtml();
				valor=false;
			}
			if(seleccion.equals("2"))
			{
				constructor = new ConstructorDocumentacionVehiculoPdf();
				valor=false;
			}
		}
		while(valor==true);
		
		Vendedor vendedor = new Vendedor(constructor);
		Documentacion documentacion = vendedor.construye("Martin");
		documentacion.imprime();
	}
}
