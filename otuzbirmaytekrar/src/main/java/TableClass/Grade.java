package TableClass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="grades")
public class Grade{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grade_id_sequence")
    @SequenceGenerator(name="grade_id_sequence", allocationSize = 1, initialValue = 1)
    private int id;
    @Column
    private String name;
}
