package com.example.demo.dto;

import javax.persistence.*;

@Entity
@Table(name="Salas")
public class Salas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "Pelicula")//no hace falta si se llama igual
	private Peliculas Pelicula;
	
	public Salas() {
		super();
	}

	public Salas(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Peliculas getPelicula() {
		return Pelicula;
	}

	public void setPelicula(Peliculas pelicula) {
		this.Pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Salas [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
