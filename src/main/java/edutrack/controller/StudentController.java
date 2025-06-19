package edutrack.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edutrack.model.Student;
import edutrack.repository.StudentRepository;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepository sr;

	@GetMapping("/register")
	public String getRegister(Model m) {
		m.addAttribute("student", new Student());
		return "register";
	}
	
	@PostMapping("/register")
	public String check(@Valid @ModelAttribute("student") Student s, BindingResult br, Model m ) {
		
		if(br.hasErrors())
			return "register";
		sr.save(s);
		m.addAttribute("student", s);
		return "success";
	}
}
