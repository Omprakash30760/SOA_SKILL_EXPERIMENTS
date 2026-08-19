package soa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.service.ProductService;

@RestController
@RequestMapping("/")
public class ProductController {
	ProductService PS;
	public ProductController(ProductService PS) {
		this.PS = PS;
	}
//	public ProductController(ProductService pS) {
//		super();
//		PS = pS;
//	}
	
	@GetMapping("/products")
	public Object product() {
		return PS.getAllProduct();
	}

}
