package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Album;


@Repository

public interface AlbumRepository extends JpaRepository <Album, Integer>{

}
