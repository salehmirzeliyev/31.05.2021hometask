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
@Table(name="subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="subject_id_sequence")
    @SequenceGenerator(name="subject_id_sequence", allocationSize = 1, initialValue = 1)
    private int id;
    @Column
    private String name;
}
