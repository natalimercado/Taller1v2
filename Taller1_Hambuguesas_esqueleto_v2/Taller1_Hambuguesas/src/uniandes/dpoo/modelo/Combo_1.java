package uniandes.dpoo.modelo;

import java.util.ArrayList;

public class Combo {
	private String nombreCombo;
	private double descuento;
	private ArrayList<String> itemsCombo;    // SIMPLIFICACION: Lista de nombres de los productos del menu que componen el combo. Revisar el diagrama de clases
	
	/**
	 * Constructor de la clase
	 */
	public Combo(String nombreP, double descuentoP)
	{
		this.nombreCombo = nombreP;
		this.descuento = descuentoP;
		this.itemsCombo = new ArrayList<String>();    
	}

	/**
	 * Agrega el nombre de un productoMenu a un combo. Metodo simplificado.
	 * @param nombreProducto
	 */
	public void agregarProducto(String nombreProducto)
	{
		this.itemsCombo.add(nombreProducto);
	}
	
	/**
	 * Permite convertir un objeto Combo a un String 
	 */
	@Override
	public String toString()
	{
		return this.nombreCombo + "-" + this.descuento + "-" + this.itemsCombo;
	}
}
