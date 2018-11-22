/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digibizna.dao;

import com.digibizna.models.Business;
import com.digibizna.repositories.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ekaranja
 */
@Service
public class BusinessDao {
    
    @Autowired
    private BusinessRepository businessRepository;
    /*
    save and return a business entity
    */
    
    public Business saveBusiness(Business business){
        return businessRepository.save(business);
    
    }
    
}
