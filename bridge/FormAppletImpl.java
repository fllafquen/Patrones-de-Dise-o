package bridge;

import java.util.Scanner;

public class FormAppletImpl implements FormularioImpl{
	Scanner reader = new Scanner(System.in);
	@Override
	public void dibujaTexto(String texto) {
		System.out.println("Applet: "+texto);
	}

	@Override
	public String administraZonaIndicada() {
		return reader.next();
	}
}
