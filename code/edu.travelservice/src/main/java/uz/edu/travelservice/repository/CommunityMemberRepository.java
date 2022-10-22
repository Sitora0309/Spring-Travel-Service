package uz.edu.travelservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.edu.travelservice.model.CommunityMember;

public interface CommunityMemberRepository extends JpaRepository<CommunityMember,Long>{
    //CommunityMember findByName(String name);
}