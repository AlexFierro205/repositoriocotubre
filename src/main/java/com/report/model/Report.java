package com.report.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "")
public class Report {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int id;
	@Column(name = "TIPO")
	private String tipo;
	@Column(name = "VERSION")
	private float version;
	@Column(name = "COMENTARIO")
	private String comentario;
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Report(int id, String tipo, float version, String comentario) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.version = version;
		this.comentario = comentario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getVersion() {
		return version;
	}
	public void setVersion(float version) {
		this.version = version;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	

}
