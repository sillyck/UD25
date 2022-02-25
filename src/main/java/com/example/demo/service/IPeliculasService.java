package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Peliculas;

public interface IPeliculasService {

public List<Peliculas> listarPeliculas();
	
	public Peliculas guardarPeliculas(Peliculas Peliculas);
	
	public Peliculas PeliculasXID(int id);
	
	
	public Peliculas actualizarPeliculas(Peliculas Peliculas);
	
	public void eliminarPeliculas(int id);
	
}
