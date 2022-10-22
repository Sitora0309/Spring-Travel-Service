package uz.edu.travelservice.model;

import lombok.*;
import uz.edu.travelservice.model.generator.IdGenerator;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Membership  extends IdGenerator {

    @Column(name = "travel_club_id")
    private String travelClubId;
    private String memberId;
    @Column(name = "role_in_club")
    private RoleInClub roleInClub;
    @Column(name = "join_date")
    private String joinDate;
}
