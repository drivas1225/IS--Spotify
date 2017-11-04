package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lista_cancion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_listcancion;

	public int getId_listcancion() {
		return id_listcancion;
	}

	public void setId_listcancion(int id_listcancion) {
		this.id_listcancion = id_listcancion;
	}
	
}
