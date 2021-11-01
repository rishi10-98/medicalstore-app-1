package com.cg.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.Product;
import com.cg.repository.ProductRepository;



@Service
public class ProductService {
	private static final Logger LOG = LoggerFactory.getLogger(ProductService.class);

	@Autowired
	private ProductRepository productRepo;
	//dependency injection of class
	// Get All Employee
	

		public List<Product> getAllProduct() {
			LOG.info("getAllProduct");
			return productRepo.findAll();
		}


		public Product addMedicine(Product product) {
			return productRepo.save(product);
		}
}
