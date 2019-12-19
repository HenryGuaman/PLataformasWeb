package negocio;

import java.util.List;

import javax.ejb.Local;

import modelo.Cliente;

@Local
public interface GestionClienteLocal {

	public void guardarCliente(String cedula, String nombre, String apellido, String fechaNac);
	public List<Cliente> getClientes();
	public List<Cliente> getClientesPorNombre(String filtro);
	
}
