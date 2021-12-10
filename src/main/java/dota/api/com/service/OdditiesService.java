package dota.api.com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import dota.api.com.model.Oddities;
import dota.api.com.repository.OdditiesRepository;

@Service
public class OdditiesService implements BaseService<Oddities>{
	
	@Autowired
	private OdditiesRepository repo;
	@Override
	public List<Oddities> obtenerTodo() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Oddities> obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		Optional<Oddities> entityOptional = repo.findById(id);
		if(entityOptional.isEmpty()) {
			return Optional.empty();
		}else {
			return entityOptional;
		}
	}
	
	@Override
	public Optional<Oddities> obtenerPorName(String name) {
		// TODO Auto-generated method stub
		Optional<Oddities> entityOptional = repo.findByName(name);
		if(entityOptional.isEmpty()) {
			return Optional.empty();
		}else {
			return entityOptional;
		}
	}

	@Override
	public Oddities guardar(Oddities entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}

	@Override
	public Oddities actualizar(Oddities entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.getId());
		return repo.save(entity);
	}

	@Override
	public HashMap<String, String> eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		HashMap<String, String> respuesta = new HashMap<String, String>();
		respuesta.put("mesaje", "Elemento eliminado correctamente");
		repo.deleteById(id);
		return respuesta;
	}

	

}
