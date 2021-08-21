package com.example.demo.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Album_Tbl")
@Getter 
@Setter 
@AllArgsConstructor
@NoArgsConstructor

public class Album {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int album_id;
	private String albumName;
	private Date releaseDate;
	private String description;
	private int songsCount;
	@ManyToOne //(cascade= CascadeType.ALL)
	@JoinColumn (name="band_id")
	private Band band;
}
