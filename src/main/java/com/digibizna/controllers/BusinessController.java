package com.digibizna.controllers;

import com.digibizna.models.Business;
import com.digibizna.repositories.BusinessRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ekaranja
 */
@RestController
@RequestMapping("/")
public class BusinessController {
    
    @Autowired
    private BusinessRepository businessRepository;
    
    @PostMapping("/business")
    public Business createBusiness(@Valid @RequestBody Business business){
        return businessRepository.save(business);
   
    }
    
    
    
}
