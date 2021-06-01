package TableClass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_sequence")
    @SequenceGenerator(name="student_id_sequence", allocationSize = 1, initialValue = 1)
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @ManyToOne
    @JoinColumn(name="grade_id", nullable = false)
    private Grade grade;
    @ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name="students_teachers", joinColumns=@JoinColumn(name="student_id"), inverseJoinColumns=@JoinColumn(name="teacher_id"))
    private List<Teacher> teachers;
}
