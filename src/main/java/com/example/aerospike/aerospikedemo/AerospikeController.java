package com.example.aerospike.aerospikedemo;


import com.example.aerospike.aerospikedemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/")
public class AerospikeController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProductData() {


        List<Product> productList = new ArrayList<>();

        productRepository.findAll().iterator().forEachRemaining(product -> productList.add(product));

        return ResponseEntity.ok(productList);
    }

}
