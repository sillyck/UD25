package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Departamentos;

public interface IDepartamentosService {
public List<Departamentos> listarDepartamentos();
	
	public Departamentos guardarDepartamentos(Departamentos departamentos);
	
	public Departamentos departamentoXID(Long id);
	
	public Departamentos actualizarDepartamento(Departamentos departamentos);
	
	public void eliminarDepartamento(Long id);
}
