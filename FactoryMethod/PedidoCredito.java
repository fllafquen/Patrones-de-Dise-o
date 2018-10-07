package FactoryMethod;

public class PedidoCredito extends Pedido{

	public PedidoCredito(double importe) {
		super(importe);
	}

	@Override
	public boolean valida() {
		if((importe>=1000.0)&& (importe<=5000.0))
			return true;
		else
			return false;
	}

	@Override
	public void paga() {
		System.out.println("El pago del pedido a crédito de: "+importe+" se ha realizado.");
	}

	@Override
	public void falla() {
		System.out.println("El pago del pedido por un monto de "+importe+" no pudo ser realizado.");
	}

}
