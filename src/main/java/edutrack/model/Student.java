package edutrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "student_details")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roll_no")
	private Integer id;
	
	@Column(name = "student_name", nullable = false)
	@Pattern(regexp = "^[A-Za-z]+( [A-Za-z]+)*$", message = "Only alphabets are allowed and only one space is allowed")
	private String name;
	@Positive(message = "class number should be positive")
	@Max(value = 12,message = "Highest grade is 12")
	@Column(name = "class_no")
	private Integer classNo;
}
