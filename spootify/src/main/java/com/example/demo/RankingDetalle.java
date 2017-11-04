package com.example.demo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RankingDetalle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_rankingdetalle;
	
	@Column
	private Long id_ranking;
	
	@Column(length = 64)
	private String nombre_cancion;
	
	@Column
	private Long nro_reproducciones;
	
	@Column
	private Long posicion;
	
	@Column
	private Date fecha;
}
