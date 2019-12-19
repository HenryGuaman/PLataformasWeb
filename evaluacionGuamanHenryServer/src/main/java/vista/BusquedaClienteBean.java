package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Cliente;
import negocio.GestionClienteLocal;

@ManagedBean
public class BusquedaClienteBean {

	@Inject
	private GestionClienteLocal gc;
	
	private String filtro;
	private List<Cliente> clientes;


	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}



	public String getFiltro() {
		return filtro;
	}



	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}



	public String buscar() {
		
		clientes = gc.getClientesPorNombre(filtro);
		
		return null;
	}
}
