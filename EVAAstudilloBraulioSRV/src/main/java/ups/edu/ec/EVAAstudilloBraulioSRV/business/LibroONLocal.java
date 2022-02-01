package ups.edu.ec.EVAAstudilloBraulioSRV.business;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import ups.edu.ec.EVAAstudilloBraulioSRV.model.Libro;


@Local
public interface LibroONLocal {
	
	

	public void insertarLibro(Libro libro) throws Exception;

	public List<Libro> getLibros() throws Exception;

	public Libro buscarLibro(int codigo) throws Exception;

	public Libro getLibro(int codigo) throws Exception;
	public void guardar(Libro p) throws Exception;
		
}
