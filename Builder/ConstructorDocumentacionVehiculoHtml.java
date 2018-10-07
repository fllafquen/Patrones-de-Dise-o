package Builder;

public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentacionVehiculo{

	public ConstructorDocumentacionVehiculoHtml()
	{
		documentacion = new DocumentacionHtml();
	}
	@Override
	public void ConstruyeSolicitudPedido(String nombreCliente) {
		String documento;
		documento="<HTML> solicitud de pedido Cliente: "+nombreCliente+"</HTML>";
		documentacion.agregaDocumento(documento);
	}

	@Override
	public void ConstruyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento;
		documento = "<HTML> Solicitud de matriculacion Solicitante: "+nombreSolicitante+"</HTML>";
		documentacion.agregaDocumento(documento);
	}

}
