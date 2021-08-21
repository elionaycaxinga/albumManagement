package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Band_Tbl")
@Getter 
@Setter 
@AllArgsConstructor
@NoArgsConstructor

public class Band {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private int id;
	private String name;
	private int members;
	@OneToMany (
			mappedBy= "band",
			cascade= CascadeType.ALL,
			orphanRemoval= true
			)
	//@JoinColumn (name="aid")
	
	Set<Album> albums = new HashSet<>();
	
	
	
	
	
	
}
