package nl.pandinfo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.pandinfo.domain.Soorten;
import nl.pandinfo.repository.SoortenRepository;

@Service
public class SoortenServiceImpl {
	@Autowired
	SoortenRepository soortenRepository;

	public Soorten saveSoorten(Soorten soorten){
		return soortenRepository.save(soorten);
	}
	
	public Collection<Soorten> findAllSoorten(){
		return (Collection<Soorten>)soortenRepository.findAll();
	}
}
