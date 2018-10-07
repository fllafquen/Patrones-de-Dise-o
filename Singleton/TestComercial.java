package Singleton;

public class TestComercial {
	public static void main(String[] args)
	{
		//inicialización del comercial en el sistema
		Comercial elComercial = Comercial.Instance();
		elComercial.setNombre("Camila");
		elComercial.setDireccion("Mi Casa");
		elComercial.setEmail("Camimassielh@gmail.com");
		// muestra el comercial del sistema
		visualiza();
	}
	
	public static void visualiza()
	{
		Comercial elComercial = Comercial.Instance();
		elComercial.visualiza();
	}

}
