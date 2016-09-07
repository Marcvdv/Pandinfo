package nl.pandinfo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.pandinfo.domain.Pand;
import nl.pandinfo.repository.PandRepository;

@Service
public class PandServiceImpl {
	

	@Autowired
	PandRepository pandRepository;
	
//	public Person findById(long id){
//		return personRepository.findById(id);
//	}
	
	public Pand savePand(Pand pand){
		return pandRepository.save(pand);
	}
	
	public Collection<Pand> findAllPanden(){
		return (Collection<Pand>)pandRepository.findAll();
	}
	

}
