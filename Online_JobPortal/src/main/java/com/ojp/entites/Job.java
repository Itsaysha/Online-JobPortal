package com.ojp.entites;

public class Job {
 private int id;
 private String tittle;
 private String description;
 private String category;
 private String status;
 private String location;
 private String pdate;
 
public Job(String tittle, String description, String category, String status, String location, String pdate) {
	super();
	this.tittle = tittle;
	this.description = description;
	this.category = category;
	this.status = status;
	this.location = location;
	this.pdate = pdate;
}

public Job() {
	super();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTittle() {
	return tittle;
}

public void setTittle(String tittle) {
	this.tittle = tittle;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getPdate() {
	return pdate;
}

public void setPdate(String pdate) {
	this.pdate = pdate;
}
 

 
}
