package Interpreter;

public class OperadorO extends OperadorBinario
{

	public OperadorO(Expresion operadorIzquierdo, Expresion operadorDerecho) {
		super(operadorIzquierdo, operadorDerecho);
	}

	@Override
	public boolean evalua(String descripcion) 
	{
		return operandoIzquierdo.evalua(descripcion) || operandoDerecho.evalua(descripcion);
	}
	//parte análisis sintáctico
	
	public static Expresion parsea() throws Exception
	{
		Expresion resultadoIzquierdo, resultadoDerecho;
		resultadoIzquierdo = OperadorY.parsea();
		while((pieza !=null) && (pieza.equals("o")))
		{
			siguientePieza();
			resultadoDerecho = OperadorY.parsea();
			resultadoIzquierdo = new OperadorO(resultadoIzquierdo, resultadoDerecho);
		}
		return resultadoIzquierdo;
	}
}
