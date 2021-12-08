package dota.api.com.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Users")
@Table
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String last_name;
	
	@Column
	private Double price;
	
	@Column
	private String photo;
	
	@Column
	private String user;
	
	@Column
	private String password;
	
	@Column
	private LocalDate update_at;
	
	@Column
	private LocalDate created_at;
	
	
	@ManyToOne
	@JoinColumn
	private Privileges privilegue_id;
	
	
	public Users() {
		// TODO Auto-generated constructor stub
	}


	public Users(Long id, String name, String last_name, Double price, String photo, String user, String password,
			LocalDate update_at, LocalDate created_at, Privileges privilegue_id) {
		super();
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.price = price;
		this.photo = photo;
		this.user = user;
		this.password = password;
		this.update_at = update_at;
		this.created_at = created_at;
		this.privilegue_id = privilegue_id;
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


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LocalDate getUpdate_at() {
		return update_at;
	}


	public void setUpdate_at(LocalDate update_at) {
		this.update_at = update_at;
	}


	public LocalDate getCreated_at() {
		return created_at;
	}


	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}


	public Privileges getPrivilegue_id() {
		return privilegue_id;
	}


	public void setPrivilegue_id(Privileges privilegue_id) {
		this.privilegue_id = privilegue_id;
	}
	
	
	
	
}
