package Adapter;

public class DocumentoPdf implements Documento{
	protected ComponentePdf herramientaPdf = new ComponentePdf();
	@Override
	public void setContenido(String contenido) {
		herramientaPdf.pdfFijaContenido(contenido);
	}

	@Override
	public void dibuja() {
		herramientaPdf.pdfPreparaVisualizacion();
		herramientaPdf.pdfRefresca();
		herramientaPdf.pdfFinalizaVisualizacion();
	}

	@Override
	public void imprime() {
		herramientaPdf.pdfEnviaImpresora();
	}

}
