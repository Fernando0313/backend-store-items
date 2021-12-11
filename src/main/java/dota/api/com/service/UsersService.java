package dota.api.com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import dota.api.com.model.Users;
import dota.api.com.repository.UsersRepository;

public class UsersService implements BaseService<Users>
{
	@Autowired
	private UsersRepository repo;

	@Override
	public List<Users> obtenerTodo() {
		
		return repo.findAll();
	}

	@Override
	public Optional<Users> obtenerPorId(Integer id) {

		Long idl = id.longValue();
		Optional<Users> entityOptional= repo.findById(idl);
		
		if(entityOptional.isEmpty()) {
			return Optional.empty();
		}else {
			return entityOptional;
		}

	}

	@Override
	public Users guardar(Users entity) {
		
		return repo.save(entity);
	}

	@Override
	public Users actualizar(Users entity) {
		
		return repo.save(entity);
	}

	@Override
	public HashMap<String, String> eliminarPorId(Integer id) {
		
		Long idl = id.longValue();
		repo.deleteById(idl);
		
		HashMap<String, String> respuesta = new HashMap<String, String>();
		respuesta.put("mensaje", "Elemento eliminado correctamente");
		return respuesta;
		
	}

}
