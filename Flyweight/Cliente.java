package Flyweight;

public class Cliente {
	public static void main(String[] args)
	{
		FabricaOpcion fabrica = new FabricaOpcion();
		VehiculoSolicitado vehiculo = new VehiculoSolicitado();
		vehiculo.agregaOpciones("air bags", 80, fabrica);
		vehiculo.agregaOpciones("Direccuion asistida", 90, fabrica);
		vehiculo.agregaOpciones("Elevalunas eléctricos", 82, fabrica);
		vehiculo.muestraOpciones();
	}
}
