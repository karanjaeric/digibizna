/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digibizna.controllers;

import com.digibizna.models.Customer;
import com.digibizna.repositories.CustomerRepository;
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
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    
    @PostMapping("/customer")
    public Customer createCustomer(@Valid @RequestBody Customer customer){
        return customerRepository.save(customer);
    
    }
    
    
    
}
