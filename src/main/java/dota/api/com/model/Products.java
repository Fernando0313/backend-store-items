package dota.api.com.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "products")
@Table
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private Integer stock;
	
	@Column
	private Double price;
	
	
	
	@ManyToOne
	@JoinColumn(name="heroe_id")
	private Heroes heroes;
	
	@ManyToOne
	@JoinColumn(name="rarity_id")
	private Oddities oddities;
	
	@ManyToOne
	@JoinColumn(name="space_id")
	private Spaces spaces;
	
	@ManyToOne
	@JoinColumn(name="type_id")
	private Types types;
	
	@ManyToOne
	@JoinColumn(name="quality_id")
	private Qualitys qualitys;
	
	@ManyToOne
	@JoinColumn(name="photo_id")
	private Photos photos;
	
	public Products() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Products(Long id, String name, Integer stock, Double price, Heroes heroes, Oddities oddities,
			Spaces spaces, Types types, Qualitys qualitys, Photos photos) {
		super();
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.price = price;
		this.heroes = heroes;
		this.oddities = oddities;
		this.spaces = spaces;
		this.types = types;
		this.qualitys = qualitys;
		this.photos = photos;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Heroes getHeroes() {
		return heroes;
	}

	public void setHeroes(Heroes heroes) {
		this.heroes = heroes;
	}


	public Oddities getOddities() {
		return oddities;
	}


	public void setOddities(Oddities oddities) {
		this.oddities = oddities;
	}


	public Spaces getSpaces() {
		return spaces;
	}


	public void setSpaces(Spaces spaces) {
		this.spaces = spaces;
	}


	public Types getTypes() {
		return types;
	}


	public void setTypes(Types types) {
		this.types = types;
	}


	public Qualitys getQualitys() {
		return qualitys;
	}


	public void setQualitys(Qualitys qualitys) {
		this.qualitys = qualitys;
	}


	public Photos getPhotos() {
		return photos;
	}


	public void setPhotos(Photos photos) {
		this.photos = photos;
	}
	
	
}
