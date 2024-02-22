package com.babylon.hieroglyphdatabase.domain;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface AppUserRepository extends CrudRepository<AppUser, Long>{
	Optional<AppUser> findByUsername(String username);
}
