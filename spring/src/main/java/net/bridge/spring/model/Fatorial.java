package net.bridge.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fatorial")
public class Fatorial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "number")
	private String number;
	@Column(name = "fatorial")
	private String fatorial;
	
	public Fatorial() {
	}
	
	

	public Fatorial(String number, String fatorial) {
		super();
		this.number = number;
		this.fatorial = fatorial;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFatorial() {
		return fatorial;
	}

	public void setFatorial(String fatorial) {
		this.fatorial = fatorial;
	}
	
	
	
	
	
	
	
}
