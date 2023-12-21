package infractrusture.persistence;

import java.util.ArrayList;

import modelos.Orador;

public interface IPersistencia {
	// CRUD
	
	// CREATE
	void guardar(Orador newOrador);
	
	// READ
	ArrayList<Orador> ListarOradores();
	Orador getOradorByPorId(String id);
	
	// UPDATE
	Orador update(String usuario);
	
	// DELETE
	void delete(String id);
}
