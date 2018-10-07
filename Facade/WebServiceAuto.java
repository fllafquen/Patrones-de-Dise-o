package Facade;
import java.util.*;
public interface WebServiceAuto {
	String documento(int indice);
	List<String> buscaVehiculos(int precioMedio, int desviacionMax);
}
