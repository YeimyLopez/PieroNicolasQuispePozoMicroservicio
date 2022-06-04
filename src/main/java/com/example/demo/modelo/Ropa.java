package com.example.demo.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.Table;

@Entity
@Table(name = "ropa")
public class Ropa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRopa;
	private String tipoRopa;
	private String descripcion;
	private List<Cliente> listarCliente;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="ropa_lavadora",
	joinColumns =@JoinColumn(name="id_Ropa", nullable = false, unique = true, foreignKey=
	@ForeignKey(foreignKeyDefinition = "foreign key(id_Ropa) references ropas (id_Ropas)")),
	inverseJoinColumns = @JoinColumn(name="id_Lavadora", nullable = false, unique = true, foreignKey = 
	@ForeignKey(foreignKeyDefinition = 
	"foreign key(id_Lavadora) references lavadoras (id_Lavadora)")))
	private List<Lavadora> lavadoras = new ArrayList<>();

	public Integer getIdRopa() {
		return idRopa;
	}
	public void setIdRopa(Integer idRopa) {
		this.idRopa = idRopa;
	}
	public String getTipoRopa() {
		return tipoRopa;
	}
	public void setTipoRopa(String tipoRopa) {
		this.tipoRopa = tipoRopa;
	}
	public String getDescripcion() {
		return descripcion;	
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setListarCliente(List<Cliente> listarCliente) {
		this.listarCliente = listarCliente;
	}
	public List<Cliente> getListarCliente(){
		return this.listarCliente;
	}
	
}
