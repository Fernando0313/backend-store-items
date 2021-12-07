package dota.api.com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "oddieties")
@Table
public class Oddities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@OneToMany
	@JoinColumn(name="rarity_id")
	private List<Products> products;	
	
	public Oddities() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Oddities(String name) {
		super();
		this.name = name;
	}



	public Oddities(Integer id, String nombre, List<Products> products) {
		super();
		this.id = id;
		this.name = nombre;
		this.products = products;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
	
	
}
