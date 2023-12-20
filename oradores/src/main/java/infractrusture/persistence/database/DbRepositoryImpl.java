package infractrusture.persistence.database;

import java.util.ArrayList;

import infractrusture.persistence.IPersistencia;
import modelos.Orador;

public class DbRepositoryImpl implements IPersistencia{
	
	public static ArrayList<Orador> bdMySql = new ArrayList<>();
	
	@Override
	public void guardar(Orador newOrador) {
		DbRepositoryImpl.bdMySql.add(newOrador);
	}

	@Override
	public ArrayList<Orador> ListarOradores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orador getOradorByPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orador update(String usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	
}
