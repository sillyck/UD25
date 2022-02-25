package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalasDAO;
import com.example.demo.dto.Salas;

@Service
public class SalasServiceIMPL implements ISalasService {

	@Autowired
	ISalasDAO iSalasDAO;
	@Override
	public List<Salas> listarSalas() {
		return iSalasDAO.findAll();
	}

	@Override
	public Salas guardarSalas(Salas Salas) {
		return iSalasDAO.save(Salas);
	}

	@Override
	public Salas SalasXID(int id) {
		return iSalasDAO.findById(id).get();
	}


	@Override
	public Salas actualizarSalas(Salas Salas) {
		return iSalasDAO.save(Salas);
	}

	@Override
	public void eliminarSalas(int id) {
		iSalasDAO.deleteById(id);
	}

	
}
