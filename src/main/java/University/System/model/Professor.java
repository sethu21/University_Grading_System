package University.System.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "Professor")
public class Professor {

    @Setter(value = AccessLevel.NONE)
    @Id
    @Column(name = "ID_P")
    private long idp;

    @NotNull
    @Pattern(regexp = "[A-Z]{1}[a-z]+")
    @Size(min = 2, max = 10)
    @Column(name = "Name")
    private String name;

    @NotNull
    @Pattern(regexp = "[A-Z]{1}[a-z]+")
    @Size(min = 2, max = 10)
    @Column(name = "Surname")
    private String surname;

    @NotNull
    @Column(name = "Degree")
    private Degree degree;

    public Professor(String name, String surname, Degree degree) {
        setName(name);
        setSurname(surname);
        setDegree(degree);
    }
}
