package University.System.repo;


import University.System.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo  extends CrudRepository<Student, Long> {
}
