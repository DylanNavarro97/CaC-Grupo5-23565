package modelos;

import java.util.UUID;

public class Orador {
	private String nombre;
	private String Apellido;
	private String tema;
	
	public Orador(String nombre, String apellido, String tema) {
		this.nombre = nombre;
		this.Apellido = apellido;
		this.tema = tema;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
}
