package edutrack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edutrack.model.Student;
import edutrack.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository sr;
	
	public void save(Student s) {
		sr.save(s);
	}
	
	public List<Student> findAllStudents() {
		return sr.findAll();
	}
	
	public boolean findByIdStudent(Integer id)
	{
		return sr.findById(id).isPresent();
	}
	
	public void deleteByIdStudent(Integer id)
	{
		sr.deleteById(id);
	}
	
	public void updateStudentDetails(Student s) {
		sr.updateAllDetails(s.getId(), s.getName(), s.getClassNo(), s.getEmail(), s.getPhoneNumber());
	}
	
	public Student getStudentById(Integer id) {
		if(!findByIdStudent(id))
			throw new RuntimeException("Student Not Found With this ID");
		return sr.findById(id).get();
	}
}
