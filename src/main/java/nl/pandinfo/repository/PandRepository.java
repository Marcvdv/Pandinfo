package nl.pandinfo.repository;

import org.springframework.data.repository.CrudRepository;

import nl.pandinfo.domain.Pand;

public interface PandRepository extends CrudRepository<Pand, Long> {
	
}
