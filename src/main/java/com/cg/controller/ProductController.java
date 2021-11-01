package com.cg.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Product;
import com.cg.service.ProductService;


@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")

@RestController
public class ProductController {
	private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);
@Autowired
ProductService productService;

@GetMapping("/getall") // Endpoints
//@PreAuthorize("hasRole('EMPLOYER')")
public List<Product> getAllProducts() {
	LOG.info("getAllProduct");
		return productService.getAllProduct();
}
}
