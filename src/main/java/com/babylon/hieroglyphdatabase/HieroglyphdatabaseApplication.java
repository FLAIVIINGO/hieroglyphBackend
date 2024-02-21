package com.babylon.hieroglyphdatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.babylon.hieroglyphdatabase.domain.Hieroglyph;
import com.babylon.hieroglyphdatabase.domain.HieroglyphRepository;

@SpringBootApplication
public class HieroglyphdatabaseApplication implements CommandLineRunner{
	private static final Logger logger = LoggerFactory.getLogger(HieroglyphdatabaseApplication.class);
	private final HieroglyphRepository repository;
	
	public HieroglyphdatabaseApplication(HieroglyphRepository repository) {
		this.repository = repository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HieroglyphdatabaseApplication.class, args);
	}
	
	@Override
	public void run(String... args)throws Exception {
		int cp1 = 0x131CC;
		int cp2 = 0x13171;
		int cp3 = 0x130C0;
		String h1 = new String(Character.toChars(cp1));
		String h2 = new String(Character.toChars(cp2));
		String h3 = new String(Character.toChars(cp3));
		Hieroglyph hiero1 = new Hieroglyph(h1, "pair of reeds", "y");
		Hieroglyph hiero2 = new Hieroglyph(h2, "quail chick", "w");
		Hieroglyph hiero3 = new Hieroglyph(h3, "lower leg", "b");
		repository.save(hiero1);
		repository.save(hiero2);
		repository.save(hiero3);
			
		for(Hieroglyph hieroglyph : repository.findAll()) {
			logger.info("Hieroglyph: {} Image: {} Sound: {}", hieroglyph.getHieroglyph(), hieroglyph.getDescription(), hieroglyph.getSoundText());
		}
	}

}
