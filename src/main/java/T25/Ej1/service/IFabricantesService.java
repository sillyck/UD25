package T25.Ej1.service;

import java.util.List;

import T25.Ej1.dto.Fabricantes;

/**
 * 
 * @author JOAN
 *
 */
public interface IFabricantesService {
	
	public List<Fabricantes> listarFabricantes();

	public Fabricantes guardarFabricantes(Fabricantes fabricantes);
	
	public Fabricantes fabricantesXID(Long id);
	
	public Fabricantes actualizarFabricantes(Fabricantes fabricantes);
	
	public void eliminarFabricantes(Long id);
}
