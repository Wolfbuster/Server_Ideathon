package com.ults.ideathon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class CandidateInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Size(min = 3) 
	private String name;
	
	private String title;
	
	private String date;

	private int noveltyRate;
	
	private int feasibilityRate;
	
	private int relevanceRate;
	
	private int rate;
	

	
	public CandidateInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CandidateInformation(int id, @Size(min = 3) String name, String title, String date, String status,
			int noveltyRate, int feasibilityRate, int relevanceRate, int rate) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.date = date;
		this.noveltyRate = noveltyRate;
		this.feasibilityRate = feasibilityRate;
		this.relevanceRate = relevanceRate;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNoveltyRate() {
		return noveltyRate;
	}

	public void setNoveltyRate(int noveltyRate) {
		this.noveltyRate = noveltyRate;
	}

	public int getFeasibilityRate() {
		return feasibilityRate;
	}

	public void setFeasibilityRate(int feasibilityRate) {
		this.feasibilityRate = feasibilityRate;
	}

	public int getRelevanceRate() {
		return relevanceRate;
	}

	public void setRelevanceRate(int relevanceRate) {
		this.relevanceRate = relevanceRate;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}



	
}
