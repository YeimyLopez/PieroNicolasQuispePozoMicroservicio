package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
@Table(name="lavadora")
@Entity
public class Lavadora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLavadora;
	private String descripcion;
	private String marca;
	private String voltaje;
	private List<Cliente> listarCliente;
	
	public Integer getIdLavadora() {
		return idLavadora;
	}
	public void setIdLavadora(Integer idLavadora) {
		this.idLavadora = idLavadora;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getVoltaje() {
		return voltaje;
	}
	public void setVoltaje(String voltaje) {
		this.voltaje = voltaje;
	}
	
	public void setListarCliente(List<Cliente> listarCliente) {
		this.listarCliente = listarCliente;
	}
	
	public List<Cliente> getListarCliente(){
		return this.listarCliente;
	}
	

	
	
}
