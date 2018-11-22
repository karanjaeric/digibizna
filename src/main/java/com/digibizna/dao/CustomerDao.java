/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digibizna.dao;

import com.digibizna.models.Customer;
import com.digibizna.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ekaranja
 */
@Service
public class CustomerDao {
    
    @Autowired
    private CustomerRepository customerRepository;
    
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    
    }
    
}
