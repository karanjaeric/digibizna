/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digibizna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 *
 * @author ekaranja
 */
@SpringBootApplication
@EnableJpaAuditing
public class Application  extends SpringBootServletInitializer {
    
        public static void main(String[] arg){
        SpringApplication.run(Application.class, arg);
    
    }
    
    
}
