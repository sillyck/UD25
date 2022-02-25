package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Departamentos;
import com.example.demo.service.DepartamentosServiceIMPL;

@RestController
@RequestMapping("/api")
public class DepartamentoController {
	
	@Autowired
	DepartamentosServiceIMPL departamentosServiceIMPL;
	
	@GetMapping("/departamentos")
	public List<Departamentos> listarDepartamentos(){
		return departamentosServiceIMPL.listarDepartamentos();
	}
	
	@PostMapping("/departamentos")
	public Departamentos guardarDepartamentos(@RequestBody Departamentos departamentos) {
		return departamentosServiceIMPL.guardarDepartamentos(departamentos);
	}
	
	@GetMapping("/departamentos/{id}")
	public Departamentos departamentoXID(@PathVariable(name="id") Long id) {
		Departamentos dep_xid = new Departamentos();
		
		dep_xid = departamentosServiceIMPL.departamentoXID(id);
		
		System.out.println("Departamento: "+dep_xid);
		
		return dep_xid;
	}
	
	@PutMapping("/departamentos/{id}")
	public Departamentos actualizarDepartamento(@PathVariable(name="id") Long id,@RequestBody Departamentos departamentos) {
		Departamentos dep_sel = new Departamentos();
		Departamentos dep_act = new Departamentos();
		
		dep_sel = departamentosServiceIMPL.departamentoXID(id);
		
		dep_sel.setNombre(departamentos.getNombre());
		dep_sel.setPresupuesto(departamentos.getPresupuesto());
		
		dep_act=departamentosServiceIMPL.actualizarDepartamento(dep_sel);
		
		System.out.println("El cliente actualizado es: "+dep_act);
		
		return dep_act;
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void eliminarDepartamento(@PathVariable(name="id")Long id) {
		departamentosServiceIMPL.eliminarDepartamento(id);
	}
}
