package nl.pandinfo.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.example.domain.Person;
//import com.example.service.PersonServiceImpl;

@Controller
public class WebController {
	
	@RequestMapping("/")
	public String start(Model model){
		return "index";
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
