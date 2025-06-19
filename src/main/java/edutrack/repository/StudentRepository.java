package edutrack.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edutrack.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Override
//	<T extends Student> T save(T entity);
	Student save(Student entity);
	
	@Override
	List<Student> findAll();
	
	@Override
	Optional<Student> findById(Integer id);
	
	@Override
	void deleteById(Integer id);
}
