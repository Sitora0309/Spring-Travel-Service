package uz.edu.travelservice.controller;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.edu.travelservice.model.Membership;
import uz.edu.travelservice.service.MembershipService;
import uz.edu.travelservice.service.MembershipServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class MembershipController {

    @Autowired
    private MembershipServiceImpl membershipService;



}
