package Builder;

public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo{

	public ConstructorDocumentacionVehiculoPdf()
	{
		documentacion = new DocumentacionPdf();
	}
	@Override
	public void ConstruyeSolicitudPedido(String nombreCliente) {
			String documento;
			documento = "<PDF> Solicitud de pedido cliente: "+nombreCliente+"</PDF>";
			documentacion.agregaDocumento(documento);
	}

	@Override
	public void ConstruyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento;
		documento = "<PDF> Solicitud de matriculacion Solicitante: "+nombreSolicitante+"</PDF>";
		documentacion.agregaDocumento(documento);
		
	}

}
