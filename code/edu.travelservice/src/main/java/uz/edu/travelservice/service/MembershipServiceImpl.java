package uz.edu.travelservice.service;

import ch.qos.logback.classic.Logger;
import org.springframework.stereotype.Service;
import uz.edu.travelservice.exception.MembershipNotFoundException;
import uz.edu.travelservice.model.Membership;
import uz.edu.travelservice.repository.MembershipRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MembershipServiceImpl implements MembershipService{
    @Override
    public Membership registrationMembership(Membership membership) {
        LOG.info("REQUEST registration club: {}", membership);
        return MembershipRepository.save(membership);
        return null;
    }

    @Override
    public Membership findMembership(String membership) {
        return null;
    }

    @Override
    public Membership findMembershipByClubIdandMemberId(Long id) {
        try {
            Optional<Membership> membership = MembershipRepository.findByClubIdandMemberId(id);
            if (membership.isEmpty()) {
                throw new MembershipNotFoundException("Membership is not exist this: " + id);
            }
        }catch(Exception e) {
            System.out.println("Membership is not exist this: ");
        }
        return MembershipRepository.findByClubIdandMemberId(id);

    }

    @Override
    public Membership findMembershipByEmail(String email) {
        try {
            Optional<Membership> membership = MembershipRepository.findByEmail(email;
            if (membership.isEmpty()) {
                throw new MembershipNotFoundException("Membership is not exist this: " + email);
            }
        }catch(Exception e) {
            System.out.println("Membership is not exist this: ");
        }
        return MembershipRepository.findByEmail(email);
    }

    @Override
    public List<Membership> findAllMembershipsOfClub(String club) {
        try {
            Optional<Membership> membership = MembershipRepository.findMembershipOfClub(club);
            if (membership.isEmpty()) {
                throw new MembershipNotFoundException("Membership is not exist this: " + club);
            }
        }catch(Exception e) {
            System.out.println("Membership is not exist this: ");
        }
        return MembershipRepository.findMembershipOfClub(club);
    }

    @Override
    public List<Membership> findAllMembershipOfMember(String member) {
        return null;
    }

    @Override
    public List<Membership> findAllMembershipOfMember() {
        return  MembershipRepository.
    }

    @Override
    public void modifyMembership(String name, Membership membership) {

        throw MembershipNotFoundException;
    }

    @Override
    public void removeMembership(String name) {

    }
}
