package Facade;

import java.util.List;

public class WebServiceAutoImpl implements WebServiceAuto{
	protected Catalogo catalogo = new ComponenteCatalogo();
	protected GestionDocumento gestiondocumento = new ComponenteGestionDocumento();
	@Override
	public String documento(int indice) {
		// TODO Auto-generated method stub
		return gestiondocumento.documento(indice);
	}

	@Override
	public List<String> buscaVehiculos(int precioMedio, int desviacionMax) {
		// TODO Auto-generated method stub
		return catalogo.buscaVehiculos(precioMedio-desviacionMax, precioMedio+desviacionMax);
	}

}
