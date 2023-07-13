package ec.edu.ups.eva62japa.negocio;

import java.util.List;

import ec.edu.ups.eva62japa.modelo.Motocicleta;
import ec.edu.ups.eva62japa.servicios.MotocicletaDAO;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless

public class GestionMotocicleta {
	
	@Inject
	private MotocicletaDAO daoMoto;
	
	public List<Motocicleta> listaMotocicleta(){
		return daoMoto.getAll();
	}
	
	public void guardarProducto(Motocicleta motocicleta) throws Exception{

		if(daoMoto.read(motocicleta.getId_Producto())==null) {
			try {
				daoMoto.insert(motocicleta);
			}
			catch(Exception e){
				throw new Exception("Error al ingresar:"+e.getMessage());
			}
		}else {
				try {
					daoMoto.update(motocicleta);
				}
				catch(Exception e){
					throw new Exception("Error al Actualizar:"+e.getMessage());
					
				}
			}
		}
}
