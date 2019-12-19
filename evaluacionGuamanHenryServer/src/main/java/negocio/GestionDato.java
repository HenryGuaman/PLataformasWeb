package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.clienteDAO;
import modelo.Cliente;

@Stateless
public class GestionDato implements GestionClienteLocal, GestionClienteRemote {


	@Inject
	private clienteDAO daoC;
	
	public void guardarCliente(String cedula, String nombre, String apellido, String fechaNac){
		Cliente c = new Cliente();  
		c.setCedula(cedula);
		c.setNombre(nombre);
		c.setApellido(apellido);
		c.setFechaNac(fechaNac);
		daoC.insert(c);
		
	}
	
	public List<Cliente> getClientes(){
		
		return daoC.getClientes();
	}
	
	public List<Cliente> getClientesPorNombre(String filtro){
		
		return daoC.getClientesXNombre(filtro);
	}
}
