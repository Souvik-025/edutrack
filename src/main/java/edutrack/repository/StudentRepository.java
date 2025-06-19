package edutrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edutrack.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Override
//	<T extends Student> T save(T entity);
	Student save(Student entity);
}
