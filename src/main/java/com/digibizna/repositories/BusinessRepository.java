package com.digibizna.repositories;

import com.digibizna.models.Business;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ekaranja
 */
public interface BusinessRepository extends JpaRepository<Business, Long>{
    
}
