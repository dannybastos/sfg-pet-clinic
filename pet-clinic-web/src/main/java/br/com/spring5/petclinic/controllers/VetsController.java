package br.com.spring5.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.spring5.petclinic.model.Vet;
import br.com.spring5.petclinic.service.VetsService;

@Controller
public class VetsController {

	private static final String VETS_VIEW = "vets/vets";
	private VetsService vetService;
	
	public VetsController(VetsService vetService) {
		super();
		this.vetService = vetService;
	}

	@GetMapping({"vets"})
	public String listVets(Model model) {
		Iterable<Vet> vetList = this.vetService.findAll();
		model.addAttribute("vetList", vetList);
		return VETS_VIEW;
	}
	
}
