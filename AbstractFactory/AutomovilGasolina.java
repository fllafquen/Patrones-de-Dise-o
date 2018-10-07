package AbstractFactory;

public class AutomovilGasolina extends Automovil{

	public AutomovilGasolina(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Automovil a gasolina Modelo: "+modelo+ " Color: "+color+" Potencia: "+potencia+" Espacio: "+espacio);
	}

}
