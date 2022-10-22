package uz.edu.travelservice.service;

import uz.edu.travelservice.model.Membership;

import java.util.List;

public interface MembershipService {

    Membership registrationMembership (Membership membership);
    Membership findMembership(String membership);
    Membership findMembershipByClubIdandMemberId(Long id);
    Membership findMembershipByEmail(String email);
    List<Membership>findAllMembershipsOfClub(String club);
    List<Membership>findAllMembershipOfMember(String member);
    void modifyMembership(String name, Membership membership);
    void removeMembership(String name);
}
