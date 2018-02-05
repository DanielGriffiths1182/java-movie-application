package com.daniel.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

// NOTE Movie Model and instantiate database items
@Entity
public class Movie {

  // NOTE Generate PKey ID automatically
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	private String title;
	private String director;


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Movie() {
		super();
	}
	public Movie( String title, String director) {
		super();

		this.title = title;
		this.director = director;
	}


}
