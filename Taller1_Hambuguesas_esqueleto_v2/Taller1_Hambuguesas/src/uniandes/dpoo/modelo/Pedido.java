package uniandes.dpoo.modelo;

public class Pedido {
	private int numeroPedidos;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;

	public Pedido(String elNombreCliente, String eldireccionCliente)
	{
		this.nombreCliente = elNombreCliente;
		this.direccionCliente = eldireccionCliente;
	}
	public String getNombre()
	{ 
		return nombre;

	}	
	
	public int getcostoAdicional()
	{
		return costoAdicional;
	}
	
}
