package uz.edu.travelservice.aggregate.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CommunityMemberDto {

    @JsonProperty(namespace = "email")
    private String email;
    @JsonProperty(namespace = "name")
    private String name;
    @JsonProperty(namespace = "phone_number")
    private String phoneNumber;
    @JsonProperty(namespace = "birth_day")
    private String birthDay;
    @JsonProperty(namespace= "nick_name")
    private String nickName;
}
