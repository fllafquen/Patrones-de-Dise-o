package Prototype;

public class OrdenPedido extends Documento{

	@Override
	public void imprime() {
		System.out.println("Muestra la orden de pedido: "+contenido);
	}

	@Override
	public void visualiza() {
		System.out.println("Imprime la orden de pedido: "+contenido);
	}

}
