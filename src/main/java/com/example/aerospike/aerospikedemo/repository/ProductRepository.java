package com.example.aerospike.aerospikedemo.repository;


import com.example.aerospike.aerospikedemo.Product;
import org.springframework.data.aerospike.repository.AerospikeRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends AerospikeRepository<Product, Integer> {
}
