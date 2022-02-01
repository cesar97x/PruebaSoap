package ups.edu.ec.EVAAstudilloBraulioSRV.services;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ups.edu.ec.EVAAstudilloBraulioSRV.business.LibroONLocal;
import ups.edu.ec.EVAAstudilloBraulioSRV.model.Libro;


@WebService
public class LibroService {
	@Inject
	private LibroONLocal libroON;

	

	
	@WebMethod
	public String CrearLibro(Libro libro) {
		try {
			libroON.insertarLibro(libro);
			return "Libro Registrado";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "ERROR";
		}
	}
	

	@WebMethod
	public List<Libro> getLibros() {
		try {
			return libroON.getLibros();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	

	

	}

