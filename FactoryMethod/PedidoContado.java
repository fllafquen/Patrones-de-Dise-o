package FactoryMethod;

public class PedidoContado extends Pedido{

	public PedidoContado(double importe) {
		super(importe);
	}

	@Override
	public boolean valida() {
		if(importe>=1)
			return true;
		else
			return false;
	}

	@Override
	public void paga() {
		System.out.println("El pago del pedido por importe de: "+importe+ " fue pagado.");
	}

	@Override
	public void falla() {
		System.out.println("El valor es menor a 1.");
		
	}

}
