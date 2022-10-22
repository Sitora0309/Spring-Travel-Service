package uz.edu.travelservice.aggregate.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.edu.travelservice.model.RoleInClub;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class MembershipDto {
    @JsonProperty(namespace = "travel_club_id")
    private String travelClubId;
    @JsonProperty(namespace = "member_id")
    private String memberId;
    @JsonProperty(namespace = "role_in_club")
    private RoleInClub roleInClub;
    @JsonProperty(namespace = "join_date")
    private String joinDate;
}
