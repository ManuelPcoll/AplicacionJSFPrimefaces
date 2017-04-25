
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 8940633079408231822L;
	private String nombre;
	private String apellidos;
	private String DNI;
	
	//Cada vez que se llama al wb service se entra por el constructor
	public Usuario(String nombre,String apellidos,String DNI){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.DNI=DNI;
	}
	
	public Usuario(){
		System.out.println("Se entra por el constructor sin parametros");

	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	@Override
	public String toString(){
		return this.nombre+"-"+this.apellidos+"-"+this.DNI;
	}
	

}