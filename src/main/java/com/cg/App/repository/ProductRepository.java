package com.cg.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.App.model.Product;

public interface ProductRepository extends JpaRepository<Product ,Long>{

}
