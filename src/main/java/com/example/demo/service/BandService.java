package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.BandRepository;

@Service

public class BandService {

	@Autowired
	BandRepository bandRepository;
	
	

}
