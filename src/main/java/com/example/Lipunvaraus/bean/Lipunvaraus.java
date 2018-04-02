package com.example.Lipunvaraus.bean;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Lipunvaraus {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	
	@ManyToOne
    @JsonIgnore
    @JoinColumn(name = "teatteriid")
    private Teatteri teatteri;
	
	public Lipunvaraus() {}
		
	public Lipunvaraus(String firstname, String lastname, Teatteri teatteri) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.teatteri = teatteri;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Teatteri getTeatteri() {
		return teatteri;
	}

	public void setTeatteri(Teatteri teatteri) {
		this.teatteri = teatteri;
		
	}
		
	@Override
	public String toString() {
		if (this.teatteri != null)
			return "Lipunvaraus [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + this.getTeatteri() + "]";		
		else
			return "Lipunvaraus [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	
	}
}
