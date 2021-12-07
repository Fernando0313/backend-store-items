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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@PostMapping("")
	public ResponseEntity<Oddities> crearOddities(@RequestBody Oddities oddities){
		
		
		Oddities objOddities =service.guardar(new Oddities(oddities.getName()));
		
		return new ResponseEntity<Oddities>(objOddities,HttpStatus.CREATED);
	}
	
	
}
