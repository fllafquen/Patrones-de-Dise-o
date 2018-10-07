package Facade;

import java.util.*;

public class ComponenteCatalogo implements Catalogo{

	protected Object[] descripcionVehiculo =
		{
				"Berlina 5 puertas",6000, "Compact 3 puertas", 4000,"Escape 5 puertas",800,
				"Break 5 puertas",7000,"Coupé 2 puertas",9000,"Utilitario 3 puertas",5000
		};
	@Override
	public List<String> buscaVehiculos(int precioMin, int precioMax) 
	{
		int indice, tamaño;
		List<String> resultado = new ArrayList<String>();
		tamaño = descripcionVehiculo.length /2;
		for(indice = 0;indice<tamaño;indice++)
		{
		//	int ind =2*(indice+1);
			int precio = (Integer)descripcionVehiculo[2*indice+1];
			if((precio>=precioMin)&&(precio<=precioMax))
				resultado.add((String)descripcionVehiculo[2*indice]);
		}
		return resultado;
	}

}
