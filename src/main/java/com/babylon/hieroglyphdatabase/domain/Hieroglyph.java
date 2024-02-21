package com.babylon.hieroglyphdatabase.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hieroglyph {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String hieroglyph;
	private String description;
	private String soundText;
	
	public Hieroglyph() {}
	
	public Hieroglyph(String hieroglyph, String description, String soundText) {
		super();
		this.hieroglyph = hieroglyph;
		this.description = description;
		this.soundText = soundText;
	}

	public String getHieroglyph() {
		return hieroglyph;
	}

	public void setHieroglyph(String hieroglyph) {
		this.hieroglyph = hieroglyph;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSoundText() {
		return soundText;
	}

	public void setSoundText(String soundText) {
		this.soundText = soundText;
	}

	public Long getId() {
		return id;
	}
	
	
}
