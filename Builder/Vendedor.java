package Builder;

public class Vendedor {
	protected ConstructorDocumentacionVehiculo constructor;
	
	public Vendedor(ConstructorDocumentacionVehiculo constructor)
	{
		this.constructor = constructor;
	}
	
	public Documentacion construye(String nombreCliente)
	{
		constructor.ConstruyeSolicitudPedido(nombreCliente);
		constructor.ConstruyeSolicitudMatriculacion(nombreCliente);
		Documentacion documentacion = constructor.resultado();
		return documentacion;
	}
}
