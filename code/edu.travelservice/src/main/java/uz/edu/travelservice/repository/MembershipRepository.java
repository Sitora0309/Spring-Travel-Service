package uz.edu.travelservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.edu.travelservice.model.Membership;

import java.util.Optional;

public interface MembershipRepository extends JpaRepository<Membership,Long> {
     Optional<Membership> findMembershipOfClub(String club);

    // Membership findByClubIdandMemberId (String Id);
}
