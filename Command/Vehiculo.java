package Command;

public class Vehiculo {
	protected String nombre;
	protected long fechaEntradaStock;
	protected double precioVenta;
	
	public Vehiculo(String nombre, long fechaEntradaStock, double precioVenta)
	{
		this.nombre = nombre;
		this.fechaEntradaStock = fechaEntradaStock;
		this.precioVenta = precioVenta;
	}
	public long getTimempoEnStock(long hoy)
	{
		return hoy - fechaEntradaStock;
	}
	public void modificaPrecio(double coeficiente)
	{
		this.precioVenta = 0.01 * Math.round(coeficiente * this.precioVenta * 100);
	}
	public void visualiza()
	{
		System.out.println("Nombre :"+nombre+" Precio de Venta: " +precioVenta+ " Fecha entrada stock: "+fechaEntradaStock);
	}
}
