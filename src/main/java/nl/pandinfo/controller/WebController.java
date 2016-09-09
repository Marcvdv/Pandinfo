package nl.pandinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import nl.pandinfo.domain.Pand;
import nl.pandinfo.domain.Soorten;
import nl.pandinfo.service.PandServiceImpl;
import nl.pandinfo.service.SoortenServiceImpl;

@Controller
public class WebController {
	@Autowired
	PandServiceImpl pandServiceImpl;
	@Autowired
	SoortenServiceImpl soortenServiceImpl;
	
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

	@RequestMapping("/rosalynn/index")
	public String rosalynn(Model model){
		model.addAttribute("pand", new Pand());
		List<Soorten> soorten = (List<Soorten>) soortenServiceImpl.findAllSoorten();
		System.out.println(soorten);
		model.addAttribute("soorten", soorten);
		return "rosalynn/index";
	}
	
	@RequestMapping("/rosalynn/pandSave")
	public String savePand2(@ModelAttribute("pand")Pand pand, Model model){
		System.out.println(pand);
		pandServiceImpl.savePand(pand);
		model.addAttribute("panden",pandServiceImpl.findAllPanden());
		return "pand";
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
