package dota.api.com.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dota.api.com.exception.ResouceNotFoundException;
import dota.api.com.model.Oddities;
import dota.api.com.model.response;
import dota.api.com.service.OdditiesService;



@RestController
@RequestMapping(path="api/v1/oddities")
@CrossOrigin(origins = "*")
public class OdditiesController {

	@Autowired
	private OdditiesService service;
	
	@GetMapping("")
	public ResponseEntity<List<Oddities>> obtenerTodo(){
		List<Oddities> odditie=new ArrayList<>();
		service.obtenerTodo().forEach(odditie::add);
		if(odditie.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(odditie,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Oddities> obtenerOdditiesPorId(@PathVariable("id") Integer id){
		Oddities objOddities= service
				.obtenerPorId(id)
				.orElseThrow(()-> new ResouceNotFoundException("El objeto estado con el id= "+id+
						" no existe"));		
		return new ResponseEntity<>(objOddities,HttpStatus.OK);
	}
	@GetMapping("/Findname/{name}")
	public ResponseEntity<Oddities> obtenerOdditiesPorName(@PathVariable("name") String name){
		
		Oddities objOddities= service
				.obtenerPorName(name)
				.orElseThrow(()-> new ResouceNotFoundException("El objeto estado con el id= "+name+
						" no existe"));		
		return new ResponseEntity<>(objOddities,HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<Object> crearOddities(@RequestBody Oddities oddities){
		
		
		Oddities objOddities =service.guardar(new Oddities(oddities.getName()));
		Map<String, Object> rtn = new LinkedHashMap<>();
		rtn.put("message", "registrado correctamente");
		rtn.put("content", objOddities);
		return new ResponseEntity<>(rtn,HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> actualizarOddities(@PathVariable("id") Integer id,@RequestBody Oddities oddities){
		System.out.println(id);
		oddities.setId(id);
		Oddities objOddities =service.actualizar(new Oddities(oddities.getId(),oddities.getName(),null));
		Map<String, Object> rtn = new LinkedHashMap<>();
		rtn.put("message", "actualizado correctamente");
		rtn.put("content", objOddities);
		return new ResponseEntity<>(rtn,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarOddities(@PathVariable("id") Integer id){
		service.obtenerPorId(id)
		.orElseThrow(()-> new ResouceNotFoundException("El objeto  con el id= "+id+
				" no existe"));
		return ResponseEntity.status(HttpStatus.OK).body(
				service.eliminarPorId(id));
		
		
	}
	
}
