package negocio;

import java.util.List;

import javax.ejb.Remote;

import modelo.Cliente;

@Remote
public interface GestionClienteRemote {

	public void guardarCliente(String cedula, String nombre, String apellido, String fechaNac);
	public List<Cliente> getClientes();
	
}
