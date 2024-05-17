package University.System.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "GradeTable")
@Entity
public class Grade {
    @Setter(value = AccessLevel.NONE)
    @Column(name = "Idg")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idg;

    @Min(1)
    @Max(10)
    @Column(name = "Grvalue")
    private int grvalue;

    @ManyToOne
    @JoinColumn(name = "Ids")//need to specify another class id column name
    private Student student;

    @ManyToOne
    @JoinColumn(name = "Idc")//need to specify another class id column name
    private Course course;


    public Grade(int grvalue, Student student, Course course) {
        setGrvalue(grvalue);
        setStudent(student);
        setCourse(course);
    }


}
