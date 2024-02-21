package com.babylon.hieroglyphdatabase.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.babylon.hieroglyphdatabase.domain.Hieroglyph;
import com.babylon.hieroglyphdatabase.domain.HieroglyphRepository;

@RestController
public class HieroglyphController {
	private final HieroglyphRepository repository;
	
	public HieroglyphController(HieroglyphRepository repository) {
		this.repository = repository;
	}
	@GetMapping("/hieroglyphs")
	public Iterable<Hieroglyph> getHieroglyphs() {
		return repository.findAll();
	}

}
