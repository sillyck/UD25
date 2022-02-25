package UD25_Ej3.service;

import java.util.List;
import UD25_Ej3.dto.Cajas;

public interface ICajasService {

	public List<Cajas> listarCajass();

	public Cajas guardarCajas(Cajas cajas);

	public Cajas CajasXID(String id);

	public List<Cajas> listarCajasAlmacenes(String almacen);

	public Cajas actualizarCajas(Cajas cajas);

	public void eliminarCajas(String numreferencia);
}
