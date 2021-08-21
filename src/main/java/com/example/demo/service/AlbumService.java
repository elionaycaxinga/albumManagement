package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.AlbumRepository;
import com.example.demo.entity.Album;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

@Service
public class AlbumService {

	@Autowired
	AlbumRepository albumRepository;
	
	public Album postService(String album) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper(); 
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		mapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
		Album alb = mapper.readValue(album, Album.class); 
		return this.albumRepository.save(alb); 
	}

}
