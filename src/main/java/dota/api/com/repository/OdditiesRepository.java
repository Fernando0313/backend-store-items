package dota.api.com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dota.api.com.model.Oddities;

@Repository
public interface OdditiesRepository extends JpaRepository<Oddities, Integer>{
	
	Optional<Oddities> findByName(String name);
}
