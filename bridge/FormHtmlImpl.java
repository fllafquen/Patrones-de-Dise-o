package bridge;

import java.util.Scanner;

public class FormHtmlImpl implements FormularioImpl
{
	Scanner reader = new Scanner(System.in);
	@Override
	public void dibujaTexto(String texto) {
		// TODO Auto-generated method stub
		System.out.println("HTML: "+texto);
	}

	@Override
	public String administraZonaIndicada() {
		return reader.next();
	}
}
