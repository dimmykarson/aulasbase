package br.com.klab.aulabase.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.klab.aulabase.models.Automovel;
import br.com.klab.aulabase.repositories.AutomovelRepository;

@Service
public class AutomovelService {

	@Autowired
	private AutomovelRepository automovelRepository;

	public List<Automovel> listar() {
		return automovelRepository.findAll();
	}
	
	
}
