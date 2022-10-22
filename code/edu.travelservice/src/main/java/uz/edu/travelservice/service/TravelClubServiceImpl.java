package uz.edu.travelservice.service;

import lombok.AllArgsConstructor;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.edu.travelservice.exception.TravelClubNotFoundException;
import uz.edu.travelservice.model.TravelClub;
import uz.edu.travelservice.repository.TravelClubRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class TravelClubServiceImpl implements TravelClubService {

    @Autowired
    private TravelClubRepository travelClubRepository;

    private final Logger LOG= LoggerFactory.getLogger(TravelClubServiceImpl.class);

    @Override
    public TravelClub registrationClub(TravelClub club) {
        LOG.info("REQUEST registration club: {}", club);
        return travelClubRepository.save(club);
    }

    @Override
    public Optional<TravelClub> findById(Long id) {
        try {
            Optional<TravelClub> club = travelClubRepository.findById(id);
            if (club.isEmpty()) {
                throw new TravelClubNotFoundException("Agency is not exist this: " + id);
            }
        }catch(Exception e) {
            System.out.println("Agency is not exist this: ");
        }
            return travelClubRepository.findById(id);
        }

    @Override
    public List<TravelClub> findClubByName(String name) {
        try {
            TravelClub travelClub = travelClubRepository.findByName(name);
            if (travelClub.equals("") || travelClub == null){
                throw new
                        TravelClubNotFoundException("Cloud not find the same" + name);
            }
        }catch (Exception e){
            System.out.println(e);
            }
        LOG.info("REQUEST find By name: ");
        return (List<TravelClub>) travelClubRepository.findByClubName(name);

    }

    @Override
    public List<TravelClub> findAll() {
        return travelClubRepository.findAll();
    }

    @Override
    public void modify(Long clubId, TravelClub travelClub) throws TravelClubNotFoundException {
    TravelClub clubDB= travelClubRepository.findById(clubId).get();
    if(Objects.nonNull(club.getClubName()) && !"".equalsIgnoreCase(clubDB.getIntroduction())) {
        clubDB.setClubName(club.getClubName());
    }else{
        throw new TravelClubNotFoundException("Please, find correct club information.");
    }

    if(Objects.nonNull(clubDB.getIntroduction()) &&!"".equalsIgnoreCase(club.getIntroduction())){
        clubDB.setIntroduction(clubDB.getIntroduction());
    }
    travelClubRepository.save(clubDB);
    }

    @Override
    public void remove(Long clubId) throws TravelClubNotFoundException {
    if(clubId ==0){
        throw new
                TravelClubNotFoundException("In database not included this id: " + clubId);
    }
    travelClubRepository.deleteById(clubId);
    }
}
