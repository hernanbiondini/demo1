package com.bolsadeideas.springboot.form.app;

// Autor: Hernán Biondini
public class Greeting {
	
private Long id;
private String message;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Greeting(Long id, String message) {
	super();
	this.id = id;
	this.message = message;
}
public Greeting(long incrementAndGet, String format) {
	super();
	this.id = incrementAndGet;
	this.message = format;
}

}
