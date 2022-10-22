package uz.edu.travelservice.model.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@SuperBuilder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public abstract class IdGenerator implements Serializable {
    //
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
