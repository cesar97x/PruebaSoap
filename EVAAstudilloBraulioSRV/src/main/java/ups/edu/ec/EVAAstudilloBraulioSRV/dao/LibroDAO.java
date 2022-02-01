package ups.edu.ec.EVAAstudilloBraulioSRV.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import javax.persistence.Query;

import ups.edu.ec.EVAAstudilloBraulioSRV.model.Libro;

@Stateless
public class LibroDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Libro per) {
		em.persist(per);
	}
	
	public void update(Libro per) {
		em.merge(per);
	}
	
	public Libro read(String id) {
		Libro per = em.find(Libro.class, id);
		return per;
	}
	
	public void delete(int id) {
		Libro per=em.find(Libro.class, id);
		em.remove(per);
	}
	
	
	public List<Libro> getList(){
		//consulta a las entidades de java no de sql
		List<Libro>listado =new ArrayList<Libro>();
		String jpql="SELECT op FROM Libro op";
				
		
		
		Query query = em.createQuery(jpql, Libro.class);
		
		listado= query.getResultList();
		//JPQL -> SQL
		
		
		return listado;
		
	}
}
