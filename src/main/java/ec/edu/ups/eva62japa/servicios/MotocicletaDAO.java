package ec.edu.ups.eva62japa.servicios;

import java.io.Serializable;
import java.util.List;

import ec.edu.ups.eva62japa.modelo.Motocicleta;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless

public class MotocicletaDAO implements Serializable{
	
	@PersistenceContext
	private EntityManager em;
	
	
	public void setEntityManager(EntityManager em) {
        this.em = em;
    	}
	public void insert(Motocicleta motocicleta) {
		em.persist(motocicleta);
	}
	public void update(Motocicleta motocicleta) {
		em.merge(motocicleta);
	}
	public Motocicleta read(int idMotocicleta) {
		Motocicleta m = em.find(Motocicleta.class, idMotocicleta);
		return m;
	}
	public void delete(int idMotocicleta) {
		Motocicleta m = em.find(Motocicleta.class, idMotocicleta);
		em.remove(m);
	}
	public List<Motocicleta> getAll(){
	String jpql = "SELECT m FROM Motocicleta m";
	Query q = em.createQuery(jpql);
	return q.getResultList();
	}


}
