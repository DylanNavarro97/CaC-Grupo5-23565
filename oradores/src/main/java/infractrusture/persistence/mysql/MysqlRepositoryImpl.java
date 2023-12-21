package infractrusture.persistence.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		String query = "SELECT * FROM oradores";
		ArrayList<Orador> oradores = new ArrayList<>();
		
		try (PreparedStatement preparedStatement = connection.prepareStatement(query);
	             ResultSet resultSet = preparedStatement.executeQuery()) {
	            while (resultSet.next()) {

	                Orador orador = new Orador(
	                    resultSet.getString("nombre"),
	                    resultSet.getString("apellido"),
	                    resultSet.getString("tema")
	                );
	                oradores.add(orador);
	            }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return oradores;	
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
