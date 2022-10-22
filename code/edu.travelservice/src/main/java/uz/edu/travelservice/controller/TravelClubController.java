package uz.edu.travelservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.edu.travelservice.exception.TravelClubNotFoundException;
import uz.edu.travelservice.model.TravelClub;
import uz.edu.travelservice.service.TravelClubService;
import uz.edu.travelservice.service.TravelClubServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TravelClubController {
    @Autowired
    private TravelClubServiceImpl travelClubService;
    private final Logger LOG = LoggerFactory.getLogger(TravelClubController.class);

   @PostMapping("/store/club")
    public TravelClub getTravelClub(@RequestBody TravelClub travelClub) {
return travelClubService.registrationClub(travelClub);
    }
    @GetMapping("/all/club")
    public List<TravelClub> clubList(){
       return travelClubService.findAll();
    }

    @DeleteMapping("/club/{id}")
    public String deleteStudentById(@PathVariable("id") Long clubId)
        throws TravelClubNotFoundException{
       travelClubService.remove(clubId);
       LOG.warn("Inside the delete of Club : {}",clubId);
       return "Deleted. Successfully..";
    }

    public void updateStudentValue(@PathVariable Long id, @RequestBody TravelClub club)
        throws TravelClubNotFoundException{
       LOG.info("Inside the updated Club of Controller: ");
       travelClubService.modify(id, club);
    }
}

