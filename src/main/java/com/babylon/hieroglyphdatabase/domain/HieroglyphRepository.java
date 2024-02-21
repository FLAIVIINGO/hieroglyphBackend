package com.babylon.hieroglyphdatabase.domain;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HieroglyphRepository extends CrudRepository<Hieroglyph,Long>{
	// Fetch hieroglyph by sound
	List<Hieroglyph> findBySoundText(@Param("soundText") String soundText);
	// Fetch hieroglyph by description
	List<Hieroglyph> findByDescription(@Param("description") String description);
}
