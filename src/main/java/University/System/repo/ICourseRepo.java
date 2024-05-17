package University.System.repo;

import University.System.model.Course;
import University.System.model.Professor;
import org.springframework.data.repository.CrudRepository;

public interface ICourseRepo  extends CrudRepository<Course, Long> {
}
