package dota.api.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dota.api.com.model.Users;


@Repository
public interface UsersRepository  extends JpaRepository<Users, Long>{

}
