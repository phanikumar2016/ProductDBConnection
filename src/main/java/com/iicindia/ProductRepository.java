package com.iicindia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by Admin on 7/5/2016.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
}
