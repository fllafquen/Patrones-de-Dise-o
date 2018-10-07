package Proxy;

public class Video implements Animacion{

	@Override
	public void dibuja() {
		System.out.println("Mostrar video");
	}

	@Override
	public void clic() { }
	public void carga() {
		System.out.println("Cargar el video");
	}
	public void reproduce() {
		System.out.println("Reproducir el video");
	}
}
