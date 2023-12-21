package oradoresServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import modelos.Orador;
import mappers.MapperJson;
import infractrusture.persistence.*;
import infractrusture.persistence.mysql.MysqlRepositoryImpl;

public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IPersistencia persistence = new MysqlRepositoryImpl();
	private ObjectMapper mapper;
    
    public Controlador() {
    	mapper = new MapperJson().getMapper();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombreInput");
		String apellido = request.getParameter("apellidoInput");
		String tema = request.getParameter("temaInput");
		
		Orador orador = new Orador(nombre, apellido, tema);
		String oradorJson = mapper.writeValueAsString(orador);
		persistence.guardar(orador);
		response.getWriter().write(oradorJson);
		
	}

}
