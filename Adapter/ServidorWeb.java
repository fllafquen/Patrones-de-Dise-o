package Adapter;

public class ServidorWeb {
	public static void main(String[] args)
	{
		Documento documento1, documento2;
		documento1 = new DocumentoHtml();
		documento1.setContenido("Wena!");
		documento1.dibuja();
		documento1.imprime();
		System.out.println();
		documento2 = new DocumentoPdf();
		documento2.setContenido("Hola Pdf");
		documento2.dibuja();
		documento2.imprime();
	}
}
