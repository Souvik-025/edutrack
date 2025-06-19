package edutrack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edutrack.model.Student;

@Controller
public class StudentController {

	@GetMapping("/register")
	public String getRegister(Model m) {
		m.addAttribute("student", new Student());
		return "register";
	}
}
