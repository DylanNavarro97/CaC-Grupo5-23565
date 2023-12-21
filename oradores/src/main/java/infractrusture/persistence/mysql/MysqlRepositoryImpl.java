package infractrusture.persistence.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import infractrusture.persistence.IPersistencia;
import modelos.Orador;

public class MysqlRepositoryImpl implements IPersistencia{
	
	
	private Connection connection;
	
	public MysqlRepositoryImpl() {
		connection = ConexionBD.getConnection();
	}
	

	@Override
	public void guardar(Orador newOrador) {
		String query = "INSERT INTO oradores (nombre, apellido, tema) VALUES (?,?,?)";
		
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, newOrador.getNombre());
			statement.setString(2, newOrador.getApellido());
			statement.setString(3, newOrador.getTema());
			
			statement.execute();
			
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
