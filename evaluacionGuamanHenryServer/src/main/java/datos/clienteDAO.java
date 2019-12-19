package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Cliente;

@Stateless
public class clienteDAO {

		@Inject
		private EntityManager em;
		
		
		public void insert(Cliente cliente) {
			em.persist(cliente);
		}
		
		public void update(Cliente cliente) {
			em.merge(cliente);
		}
		
		public void remove(String cedula ) {
			Cliente cliente = this.read(cedula);
			em.remove(cliente);
		}
		
		public Cliente read(String cedula) {
			Cliente c = em.find(Cliente.class, cedula);
			return c;
		}
		
		public List<Cliente> getClientes(){
			String jpql = "SELECT c FROM Cliente c";
			Query q = em.createQuery(jpql, Cliente.class);
			
			List<Cliente> clientes = q.getResultList();
			
			return clientes;
		}
		
		
		public List<Cliente> getClientesXNombre(String filtro){
			String jpql = "SELECT c FROM Cliente c WHERE nombre LIKE ?1";
			Query q = em.createQuery(jpql, Cliente.class);
			q.setParameter(1, "%" + filtro + "%");
			
			List<Cliente> clientes = q.getResultList();
			
			return clientes;
		}
	
}
