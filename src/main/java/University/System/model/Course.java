package University.System.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "CourseTable")
@Entity
public class Course {
    @Setter(value = AccessLevel.NONE)
    @Column(name = "Idc")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idc;

    @NotNull
    @Pattern(regexp = "[A-Za-z ]+")
    @Size(min = 5, max = 20)
    @Column(name = "Title")
    private String title;

    @Min(1)
    @Max(20)
    @Column(name = "Creditpoints")
    private int creditpoints;

    @OneToOne
    @JoinColumn(name = "Idp") //need to specify column name
    private Professor professor;

    @OneToMany(mappedBy = "course")
    @ToString.Exclude
    private Collection<Grade>grades;

    public Course(String title, int creditpoints, Professor professor)
    {
        setTitle(title);
        setCreditpoints(creditpoints);
        setProfessor(professor);
    }

}
