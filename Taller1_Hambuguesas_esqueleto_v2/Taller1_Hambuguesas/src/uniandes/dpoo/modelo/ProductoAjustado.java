package uniandes.dpoo.modelo;

public class ProductoAjustado {
	public class Ingrediente {
		private String nombre;
		private int costoAdicional;

		public Ingrediente(String elNombre, int elcosto)
		{
			this.nombre = elNombre;
			this.genero = elcosto;
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
}
