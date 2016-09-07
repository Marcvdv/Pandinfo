package nl.pandinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import nl.pandinfo.domain.Pand;
import nl.pandinfo.service.PandServiceImpl;

@Controller
public class WebController {
	@Autowired
	PandServiceImpl pandServiceImpl;
	
	@RequestMapping("/")
	public String start(Model model){
		model.addAttribute("pand", new Pand());
		return "index";
	}
	
	@RequestMapping("pandSave")
	public String savePand(@ModelAttribute("pand")Pand pand, Model model){
		System.out.println(pand);
		pandServiceImpl.savePand(pand);
		model.addAttribute("panden",pandServiceImpl.findAllPanden());
		return "pand";
	}

	@RequestMapping("pand")
	public String showPanden(Model  model){
		model.addAttribute("panden",pandServiceImpl.findAllPanden());
		return "pand";
	}
	
	@RequestMapping("/rosalynn/**")
	public void rosalynn(Model model){
		return ;
	}
	
	@RequestMapping("/dave/**")
	public void dave(Model model){
		return ;
	}
	
	@RequestMapping("/yuri/**")
	public void yuri(Model model){
		return ;
	}
	
	@RequestMapping("/marc/**")
	public void marc(Model model){
		return ;
	}
}
