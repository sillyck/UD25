package UD25_Ej3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD25_Ej3.dao.IAlmacenesDAO;
import UD25_Ej3.dto.Almacenes;

@Service
public class AlmacenesServiceIMPL implements IAlmacenesService{

	@Autowired
	IAlmacenesDAO iAlmacenesDAO;
	@Override
	public List<Almacenes> listarAlmaceness() {
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacenes(Almacenes almacenes) {
		return iAlmacenesDAO.save(almacenes);
	}

	@Override
	public Almacenes AlmacenesXID(Long id) {
		return iAlmacenesDAO.findById(id).get();
	}

	@Override
	public Almacenes actualizarAlmacenes(Almacenes almacenes) {
		return iAlmacenesDAO.save(almacenes);
	}

	@Override
	public void eliminarAlmacenes(Long id) {
		iAlmacenesDAO.deleteById(id);
	}

}
