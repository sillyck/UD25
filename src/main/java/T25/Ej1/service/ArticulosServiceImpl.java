package T25.Ej1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import T25.Ej1.dao.IArticulosDAO;
import T25.Ej1.dto.Articulos;
import T25.Ej1.dto.Fabricantes;

/**
 * 
 * @author JOAN
 *
 */
@Service
public class ArticulosServiceImpl implements IArticulosService {

	@Autowired
	IArticulosDAO iArticulosDAO;
	
	@Override
	public List<Articulos> listarArticulos() 
	{
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos guardarArticulos(Articulos articulos) 
	{
		return iArticulosDAO.save(articulos);
	}

	@Override
	public Articulos articulosXID(Long id) 
	{
		return iArticulosDAO.findById(id).get();
	}

	@Override
	public List<Articulos> listarArticulosFabricantes(Fabricantes fabricante) 
	{
		return iArticulosDAO.findByFabricante(fabricante);
	}

	@Override
	public Articulos actualizarArticulos(Articulos articulos) 
	{
		return iArticulosDAO.save(articulos);
	}

	@Override
	public void eliminarArticulos(Long id) 
	{
		iArticulosDAO.deleteById(id);
	}

}
