package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Band;

public interface BandRepository  extends JpaRepository <Band, Integer>{
	

}
