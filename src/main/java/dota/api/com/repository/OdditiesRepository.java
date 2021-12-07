package dota.api.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dota.api.com.model.Oddities;

@Repository
public interface OdditiesRepository extends JpaRepository<Oddities, Integer>{

}
