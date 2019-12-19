package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

	private static final long serialVersionUID = -4081883801015277020L;
	
	@Id
	private String cedula;
	
	private String nombre;
	private String apellido;
	private String fechaNac;
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac
				+ "]";
	}
	
	
	
}
