package edutrack.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Modifying
	@Transactional
	@Query("Update Student s set s.name=:name where s.id=:id")
	public int updateNameById(@Param("id") Integer id, @Param("name") String name);
	
}
