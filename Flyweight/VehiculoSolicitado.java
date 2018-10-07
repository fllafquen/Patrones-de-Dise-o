package Flyweight;
import java.util.*;
public class VehiculoSolicitado {
	protected List<OpcionVehiculo> opciones = new ArrayList<OpcionVehiculo>();
	protected List<Integer> precioDeVentaOpciones = new ArrayList<Integer>();
	
	public void agregaOpciones(String nombre, int precioVenta, FabricaOpcion fabrica)
	{
		opciones.add(fabrica.getOpcion(nombre));
		precioDeVentaOpciones.add(precioVenta);
	}
	public void muestraOpciones()
	{
		int indice, tamaño;
		tamaño = opciones.size();
		for(indice=0;indice<tamaño;indice++)
		{
			opciones.get(indice).visualiza(precioDeVentaOpciones.get(indice));
			System.out.println();
		}
	}
}
