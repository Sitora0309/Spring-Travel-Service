package uz.edu.travelservice.service;

import uz.edu.travelservice.model.CommunityMember;

import java.util.List;
import java.util.Optional;

public interface CommunityMemberService {
    CommunityMember registrationClub(CommunityMember member);
    CommunityMember findMemberById (Long id);
    CommunityMember findMemberByEmail(String email);
    List<CommunityMember>  findMemberByName (String name);
    void modifyMember (String name, CommunityMember communityMember);
    void remove (String name);

}
