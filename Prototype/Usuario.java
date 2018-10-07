package Prototype;

public class Usuario {
	public static void main(String[] args)
	{
		//inicialización de la documentación en blanco
		DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
		documentacionEnBlanco.incluye(new OrdenPedido());
		documentacionEnBlanco.incluye(new CertificadoCesion());
		documentacionEnBlanco.incluye(new SolicitudMatriculacion());
		//creación de documentación nueva para dos clientes
		DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Martin");
		DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Simon");
		documentacionCliente1.visualiza();
		documentacionCliente2.visualiza();
		
	}
}
