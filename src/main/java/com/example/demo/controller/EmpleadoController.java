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

import com.example.demo.dto.Empleados;
import com.example.demo.service.EmpleadosServiceIMPL;
@RestController
@RequestMapping("/api")
public class EmpleadoController {
	@Autowired
	EmpleadosServiceIMPL empleadosServiceIMPL;
	
	@GetMapping("/empleados")
	public List<Empleados> listarEmpleados(){
		return empleadosServiceIMPL.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleados guardarEmpleados(@RequestBody Empleados empleados) {
		return empleadosServiceIMPL.guardarEmpleados(empleados);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleados empleadoXID(@PathVariable(name="id") int id) {
		Empleados dep_xid = new Empleados();
		
		dep_xid = empleadosServiceIMPL.empleadoXID(id);
		
		System.out.println("Empleado: "+dep_xid);
		
		return dep_xid;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleados actualizarDepartamento(@PathVariable(name="id") int id,@RequestBody Empleados empleados) {
		Empleados emp_sel = new Empleados();
		Empleados emp_act = new Empleados();
		
		emp_sel = empleadosServiceIMPL.empleadoXID(id);
		
		emp_sel.setDni(empleados.getDni());
		emp_sel.setNombre(empleados.getNombre());
		emp_sel.setApellidos(empleados.getApellidos());

		
		emp_act=empleadosServiceIMPL.actualizarEmpleado(emp_sel);
		
		System.out.println("El cliente actualizado es: "+emp_act);
		
		return emp_act;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id")int id) {
		empleadosServiceIMPL.eliminarEmpleados(id);
	}
}
