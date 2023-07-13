package ec.edu.ups.eva62japa.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Motocicleta {
	@Id
	@GeneratedValue
	@Column(name="id_Vehiculo")
	private int codigo;
	
	@Column(name="ve_modelo")
	private String modelo;
	
	@Column(name="ve_marca")
	private String marca;
	
	@Column(name="ve_Color")
	private String color;

	public void setId_Producto(int id_Vehiculo) {
		this.codigo = id_Vehiculo;
		
	}
	public int getId_Producto() {
		return codigo;
	}
	
	public void setModelo(String modelo)
	{
		modelo=modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public String getColor() {
		return color;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}

}
