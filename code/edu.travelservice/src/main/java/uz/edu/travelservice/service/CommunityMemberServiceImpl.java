package uz.edu.travelservice.service;

import org.springframework.stereotype.Service;
import uz.edu.travelservice.model.CommunityMember;

import java.util.List;

@Service
public class CommunityMemberServiceImpl implements CommunityMemberService {
    @Override
    public CommunityMember registrationClub(CommunityMember member) {
        return member;
    }

    @Override
    public CommunityMember findMemberById(Long id) {
        return null;
    }

    @Override
    public CommunityMember findMemberByEmail(String email) {
        return null;
    }

    @Override
    public List<CommunityMember> findMemberByName(String name) {
        return null;
    }

    @Override
    public void modifyMember(String name, CommunityMember communityMember) {

    }

    @Override
    public void remove(String name) {

    }
}
