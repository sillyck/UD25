package T25.Ej1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import T25.Ej1.dao.IFabricantesDAO;
import T25.Ej1.dto.Fabricantes;

/**
 * 
 * @author JOAN
 *
 */
@Service
public class FabricantesServiceImpl implements IFabricantesService {

	@Autowired
	IFabricantesDAO iFabricantesDAO;
	
	@Override
	public List<Fabricantes> listarFabricantes() 
	{
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricantes guardarFabricantes(Fabricantes fabricantes) 
	{
		return iFabricantesDAO.save(fabricantes);
	}

	@Override
	public Fabricantes fabricantesXID(Long id) 
	{
		return iFabricantesDAO.findById(id).get();
	}

	@Override
	public Fabricantes actualizarFabricantes(Fabricantes fabricantes) 
	{
		return iFabricantesDAO.save(fabricantes);
	}

	@Override
	public void eliminarFabricantes(Long id) 
	{
		iFabricantesDAO.deleteById(id);
	}

}
