package com.sellopy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sellopy.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
