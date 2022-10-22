package uz.edu.travelservice.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import uz.edu.travelservice.model.generator.IdGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
//@Table(name ="travel-club")
public class TravelClub extends IdGenerator {

    @Column(name ="name")
    private String clubName;
    @Column(name = "introduction")
    private String introduction;
    @Column(name = "foundation time")
    private long foundationTime;
}
