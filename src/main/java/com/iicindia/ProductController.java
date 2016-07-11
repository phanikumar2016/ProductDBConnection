package com.iicindia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Admin on 7/5/2016.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

  @RequestMapping("/all")
    public List<Product> findAllUsers() {
        return productRepository.findAll();
    }
}
