package com.example.demo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ranking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_ranking;
	
	@Column(length = 64)
	private String nombre;
	
	@Column
	private Date fecha;
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Date getFecha() {
		return fecha;
	}

}
