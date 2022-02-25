package UD25_Ej3.service;

import java.util.List;
import UD25_Ej3.dto.Almacenes;

public interface IAlmacenesService {

	public List<Almacenes> listarAlmaceness();

	public Almacenes guardarAlmacenes(Almacenes Almacenes);

	public Almacenes AlmacenesXID(Long id);

	public Almacenes actualizarAlmacenes(Almacenes Almacenes);

	public void eliminarAlmacenes(Long id);
}