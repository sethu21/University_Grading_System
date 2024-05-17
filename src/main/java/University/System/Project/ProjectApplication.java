package University.System.Project;

import University.System.model.*;
import University.System.repo.ICourseRepo;
import University.System.repo.IGradeRepo;
import University.System.repo.IProfessorRepo;
import University.System.repo.IStudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	public CommandLineRunner testDB(IStudentRepo studRepo, IProfessorRepo profRepo, ICourseRepo courseRepo, IGradeRepo gradeRepo){
		return  new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Student s1 = new Student("John", "Green");
				Student s2 = new Student("Claire", "Smart");
				studRepo.save(s1);
				studRepo.save(s2);

				Professor p1 = new Professor("Karina", "Skirmante", Degree.ms);
				Professor p2 = new Professor("Vairis", "Caune", Degree.phd);
				profRepo.save(p1);
				profRepo.save(p2);


				Course c1 = new Course("Algorithm theory", 2, p2);
				Course c2 = new Course("JAVA", 4, p1);
				courseRepo.save(c1);
				courseRepo.save(c2);


				Grade g1 = new Grade(4, s1, c1);//John got 4 in AlgorithmT
				Grade g2 = new Grade(6, s1, c2);//John got 6 in JAVA
				Grade g3 = new Grade(10, s2, c1);//Claire got 10 in AlgorithmT
				Grade g4 = new Grade(7, s2, c2);//Claire got 7 in JAVA
				gradeRepo.save(g1);
				gradeRepo.save(g2);
				gradeRepo.save(g3);
				gradeRepo.save(g4);


			}
		};
	}
}
