package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Cliente;
import negocio.GestionClienteLocal;

@ManagedBean
public class GestionClienteBean {

	@Inject
	private GestionClienteLocal gcl;
	
	private String cedula;
	private String apellido;
	private String nombre;
	private String fechaNac;
	
	private List<Cliente> clientes;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public String guardarCliente() {
		
		gcl.guardarCliente(cedula, nombre, apellido, fechaNac);
		System.out.println(cedula+" "+nombre+" "+apellido+" "+fechaNac);
			clientes = gcl.getClientes();
		return "listado-clientes";
	}
	
}
