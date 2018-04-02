package com.example.Lipunvaraus.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.Lipunvaraus.bean.User;

@Entity
public class Teatteri {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long teatteriid;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "teatteri")
	private List<Teatteri> teatterit;
	
	public Teatteri() {}
	
	public Teatteri(String name) {
		super();
		this.name = name;
	}
	
	public Long getTeatteriid() {
		return teatteriid;
	}
	
	public void setTeatteriid(Long teatteriid) {
		this.teatteriid = teatteriid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Teatteri [teatteriid=" + teatteriid + ", name=" + name + "]";
	}
	
}
