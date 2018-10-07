package AbstractFactory;

public class ScooterElectricidad extends Scooter{

	public ScooterElectricidad(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Scooter eléctrico de modelo: "+modelo+ " Color: "+color+ " Potencia: "+potencia);		
	}
}
