package com.example.demo;
import java.util.List;

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
