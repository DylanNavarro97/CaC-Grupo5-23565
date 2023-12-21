package infractrusture.persistence.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	public static Connection getConnection() {
		// Driver de conexión a la base de datos
		Connection connection = null;
		
		String host = "localhost";
		String port = "3306";
		String username = "root";
		String password = "root";
		
		String nombredb = "oradores_servlet";
		String driveClassName = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driveClassName);
			// url de conexion
			
			String url = "jdbc:mysql://" + host + ":" + port + "/" + nombredb;
			
			connection = DriverManager.getConnection(url, username, password);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
		
	}
	
	
}
