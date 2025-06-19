package edutrack.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edutrack.model.Student;

@Controller
public class StudentController {

	@GetMapping("/register")
	public String getRegister(Model m) {
		m.addAttribute("student", new Student());
		return "register";
	}
	
	@PostMapping("/register")
	public String check(@Valid @ModelAttribute("student") Student s, BindingResult br, Model m ) {
		
		if(br.hasErrors())
			return "register";
		
		m.addAttribute("student", s);
		return "success";
	}
}
