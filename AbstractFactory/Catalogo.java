package AbstractFactory;
import java.util.*;

public class Catalogo {
	public static int nAutos=3;
	public static int nScooter=2;
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		FabricaVehiculo fabrica = null;
		Automovil[] autos = new Automovil[nAutos];
		Scooter[] scooters = new Scooter[nScooter];
		boolean valor=true;
		
		do
		{
			System.out.print("Desea utiliza"+
			"Vehículos eléctricos (1) o a gasolina (2)");
			String eleccion = reader.next();
			if(eleccion.equals("1"))
			{
				fabrica = new FabricaVehiculoElectricidad();
				valor=false;
			}
			if(eleccion.equals("2"))
			{
				fabrica = new FabricaVehiculoGasolina();
				valor=false;
			}
		}
		while(valor==true);
		
		
		for(int index=0; index <nAutos; index++)
		{
			autos[index]= fabrica.creaAutomovil("Estadar", "Negro", 6+index, 3.2);
		}
		for(int index=0; index< nScooter;index++)
		{
			scooters[index]= fabrica.creaScooter("Pequeño", "Negro", 1+index);
		}
		for(Automovil auto: autos)
		{
			auto.mostrarCaracteristicas();
		}
		for(Scooter scooter: scooters)
		{
			scooter.mostrarCaracteristicas();
		}
	}
}
