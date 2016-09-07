package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Pand;

public interface PandRepository extends CrudRepository<Pand, Long> {
	
}
