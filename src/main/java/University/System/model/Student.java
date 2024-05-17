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
@Table(name = "Student")
public class Student {
    @Setter(value = AccessLevel.NONE)
    @Id
    @Column(name = "ID_ST")
    private long id_st;

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



    public Student(String name, String surname) {
        setName(name);
        setSurname(surname);

    }
}
