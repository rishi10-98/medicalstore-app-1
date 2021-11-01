package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Product;

public interface ProductRepository extends JpaRepository<Product ,Long>{

}
