package uz.edu.travelservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.edu.travelservice.model.TravelClub;

public interface TravelClubRepository extends JpaRepository<TravelClub, Long> {
    TravelClub findByClubName(String name);

}
