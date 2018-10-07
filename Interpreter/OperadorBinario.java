package Interpreter;

public abstract class OperadorBinario extends Expresion
{
	protected Expresion operandoIzquierdo, operandoDerecho;
	
	public OperadorBinario(Expresion operadorIzquierdo, Expresion operadorDerecho)
	{
		this.operandoIzquierdo = operadorIzquierdo;
		this.operandoDerecho = operadorDerecho;
	}
}
