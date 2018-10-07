package bridge;

public abstract class FormularioMatriculacion {
	protected String contenido;
	protected FormularioImpl implementacion;
	
	public FormularioMatriculacion(FormularioImpl implementacion)
	{
		this.implementacion = implementacion;
	}
	public void visualiza()
	{
		implementacion.dibujaTexto("número de matricula existente: ");
	}
	public void generaDocumento()
	{
		implementacion.dibujaTexto("Solicitud de matriculacion");
		implementacion.dibujaTexto("número de matricula: "+contenido);
	}
	public boolean administraZona()
	{
		contenido = implementacion.administraZonaIndicada();
		return this.controlZona(contenido);
	}
	protected abstract boolean controlZona(String matricula);
}
