package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadosDAO;
import com.example.demo.dto.Empleados;

@Service
public class EmpleadosServiceIMPL implements IEmpleadosService {

	@Autowired
	IEmpleadosDAO iEmpleadosDAO;
	
	@Override
	public List<Empleados> listarEmpleados(){
		return iEmpleadosDAO.findAll();
	}
	@Override
	public Empleados guardarEmpleados(Empleados empleado) {
		return iEmpleadosDAO.save(empleado);
	}
	@Override
	public Empleados empleadoXID(int id) {
		return iEmpleadosDAO.findById(id).get();
	}
	
	@Override
	public Empleados actualizarEmpleado(Empleados empleado) {
		return iEmpleadosDAO.save(empleado);
	}
	
	@Override
	public void eliminarEmpleados(int id) {
		iEmpleadosDAO.deleteById(id);
	}
	
}
