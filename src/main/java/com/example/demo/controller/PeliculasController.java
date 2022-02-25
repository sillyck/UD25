package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Peliculas;
import com.example.demo.service.PeliculasServiceIMPL;

@RestController
@RequestMapping("/api")
public class PeliculasController {

	@Autowired
	PeliculasServiceIMPL PeliculasServiceIMPL;
	
	@GetMapping("/Peliculas")
	public List<Peliculas> listarPeliculas(){
		return PeliculasServiceIMPL.listarPeliculas();
	}
	
	@PostMapping("/Peliculas")
	public Peliculas salvarPeliculas(@RequestBody Peliculas Peliculas) {
		
		return PeliculasServiceIMPL.guardarPeliculas(Peliculas);
	}
	
	@GetMapping("/Peliculas/{id}")
	public Peliculas PeliculasXID(@PathVariable(name="id") int id) {
		
		Peliculas Peliculas_xid= new Peliculas();
		
		Peliculas_xid=PeliculasServiceIMPL.PeliculasXID(id);
		
		System.out.println("Peliculas XID: "+Peliculas_xid);
		
		return Peliculas_xid;
	}
	
	@PutMapping("/Peliculas/{id}")
	public Peliculas actualizarPeliculas(@PathVariable(name="id")int id,@RequestBody Peliculas Peliculas) {
		
		Peliculas Peliculas_seleccionado= new Peliculas();
		Peliculas Peliculas_actualizado= new Peliculas();
		
		Peliculas_seleccionado= PeliculasServiceIMPL.PeliculasXID(id);
		
		Peliculas_seleccionado.setNombre(Peliculas.getNombre());
		Peliculas_seleccionado.setClasificacionEdad(Peliculas.getClasificacionEdad());
		
		Peliculas_actualizado = PeliculasServiceIMPL.actualizarPeliculas(Peliculas_seleccionado);
		
		System.out.println("El Peliculas actualizado es: "+ Peliculas_actualizado);
		
		return Peliculas_actualizado;
	}
	
	@DeleteMapping("/Peliculas/{id}")
	public void eleiminarPeliculas(@PathVariable(name="id")int id) {
		PeliculasServiceIMPL.eliminarPeliculas(id);
	}
	
}
