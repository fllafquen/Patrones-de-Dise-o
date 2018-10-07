package Composite;

public class EmpresaSinFilial extends Empresa{

	@Override
	public double calculaCosteMantenimiento() {
		return nVehiculos * costeUnitarioVehiculo;
	}

	@Override
	public boolean agregaFilial(Empresa filial) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
