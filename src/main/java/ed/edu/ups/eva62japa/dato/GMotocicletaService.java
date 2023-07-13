package ed.edu.ups.eva62japa.dato;

import java.util.List;

import ec.edu.ups.eva62japa.modelo.Motocicleta;
import ec.edu.ups.eva62japa.negocio.GestionMotocicleta;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("motocicletas")
public class GMotocicletaService {
	
	@Inject
	private GestionMotocicleta gestionMoto;
	
	@GET
	@Path("saludo")
	public String saludo() {
		return "hola mundo ";
	}
	
	@GET
	@Path("listaMotocicleta")
	@Produces("application/json")
	public List<Motocicleta> lista() {
	    return gestionMoto.listaMotocicleta();
	}
	
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Response guardarProducto(Motocicleta producto)
	{
		try {
			gestionMoto.guardarProducto(producto);
			return Response.status(Response.Status.OK).entity(producto).build();
		}
		catch(Exception e) {
			e.printStackTrace();
			Error error =new Error();
			return Response.status(Response.Status.OK).entity(producto).build();
		}
	}
}
