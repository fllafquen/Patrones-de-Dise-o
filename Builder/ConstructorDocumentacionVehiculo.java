package Builder;

public abstract class ConstructorDocumentacionVehiculo {
	protected Documentacion documentacion;
	
	public abstract void ConstruyeSolicitudPedido(String nombreCliente);
	
	public abstract void ConstruyeSolicitudMatriculacion(String nombreSolicitante);
	
	public Documentacion resultado()
	{
		return documentacion;
	}
}
