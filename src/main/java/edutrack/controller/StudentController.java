package edutrack.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edutrack.model.Student;
import edutrack.repository.StudentRepository;
import edutrack.service.StudentService;

@Controller
public class StudentController {
	
//	@Autowired
//	private StudentRepository sr;
	
	@Autowired
	private StudentService ss;

	@GetMapping("/register")
	public String getRegister(Model m) {
		m.addAttribute("student", new Student());
		return "register";
	}
	
	@PostMapping("/register")
	public String check(@Valid @ModelAttribute("student") Student s, BindingResult br, Model m ) {
		
		if(br.hasErrors())
			return "register";
		ss.save(s);
		m.addAttribute("student", s);
		return "success";
	}
	
	@GetMapping("/getall")
	public String getAll(Model m) {
		m.addAttribute("students", ss.findAllStudents());
		return "studentlist";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") Integer id) {
		if(ss.findByIdStudent(id))
			ss.deleteByIdStudent(id);
		return "redirect:/getall";
	}
	
	@GetMapping("/update")
	public String update(@RequestParam("id") Integer id, Model m) {
		Student s = ss.getStudentById(id);
		m.addAttribute("student", s);
		return "update";
	}
	
	@PostMapping("/update")
	public String updateConfirm( @Valid @ModelAttribute("student") Student s, BindingResult bs, Model m) {
		if(bs.hasErrors())
			return "redirect:/update?id="+s.getId();
		
		ss.updateStudentDetails(s);
//		sr.updateAllDetails(s.getId(), s.getName(), s.getClassNo(), s.getEmail(), s.getPhoneNumber());
		m.addAttribute("student", s);
		return "success";
	}
}
