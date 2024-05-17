package University.System.repo;

import University.System.model.Grade;
import org.springframework.data.repository.CrudRepository;

public interface IGradeRepo  extends CrudRepository<Grade, Long> {
}
