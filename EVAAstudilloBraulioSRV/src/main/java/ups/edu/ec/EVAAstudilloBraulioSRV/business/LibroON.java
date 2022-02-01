package ups.edu.ec.EVAAstudilloBraulioSRV.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.EVAAstudilloBraulioSRV.dao.LibroDAO;
import ups.edu.ec.EVAAstudilloBraulioSRV.model.Libro;





@Stateless
public class LibroON implements LibroONLocal {

	@Inject
	private LibroDAO daoLibro;

	public void insertarLibro(Libro libro) throws Exception {
		/*
		 * Persona per=new Persona(); per.setCedula("0106309297");
		 * per.setNombre("Braulio Astudillo"); per.setDireccion("Cuenca");
		 * daoPersona.insert(per); System.out.println("Persona insertada");
		 */
		daoLibro.insert(libro);
	}

	public List<Libro> getLibros() throws Exception {
		return daoLibro.getList();

	}

	public Libro buscarLibro(int codigo) throws Exception {
		return daoLibro.read(codigo);
	}

	public Libro getLibro(int codigo) throws Exception {
		return daoLibro.read(codigo);
	}

	public void guardar(Libro p) throws Exception {
		if (daoLibro.read(p.getCodigo()) == null)
			daoLibro.insert(p);
		else
			daoLibro.update(p);
	}

	/*
	 * public void listar(Persona persona){
	 * 
	 * Persona per=new Persona(); per.getCedula(); per.getNombre();
	 * per.getDireccion(); daoPersona.read(0);
	 * System.out.println("Persona insertada"); }
	 */

}
