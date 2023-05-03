package br.com.klab.aulabase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.klab.aulabase.models.Automovel;
import br.com.klab.aulabase.services.AutomovelService;

@RestController
@RequestMapping(value = "/")
public class AutomovelController {
	
	@Autowired
	private AutomovelService automovelService;

	@GetMapping(value = "ok")
	public String isOK() {
		return "Estou funcionando! OK?!";
	}
	
	@GetMapping(value = "listar")
	public List<Automovel> listar(){
		return automovelService.listar();
	}
	
}
