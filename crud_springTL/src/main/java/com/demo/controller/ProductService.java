package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Product;
import com.demo.entity.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	//Create /update
	public void save(Product product) {
		repo.save(product);
	}
	//Read
		public List<Product> listAll() {
			return repo.findAll();
		}
	//find byID
	public Product get(long id) {
		return repo.findById(id).get();
	}
	//delete ByID
	public void delete(long id) {
		repo.deleteById(id);
	}
}
