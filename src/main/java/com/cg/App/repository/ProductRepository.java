package com.cg.App.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.App.model.Product;


public interface ProductRepository extends JpaRepository<Product ,Long>{
//searching query
	@Query(value= "SELECTp FROM PRODUCT p WHERE p.prod_name LIKE %:keyword% OR p.mfg_name LIKE %:keyword%" , nativeQuery = true)
	public List<Product> Search(@Param("keyword") String keyword);
}
