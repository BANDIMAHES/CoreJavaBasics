package restapiwithdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restapiwithdb.product.Product1;
import restapiwithdb.servie.Product1Service;
import restapiwithoutdb.Product;
import restapiwithoutdb.ProductService;

@RestController
@RequestMapping("/product")

public class Product1Controller {
	@Autowired
	private Product1Service productService;
	@GetMapping("/all")
	public List<Product1> getAllProduct(){
		return productService.getAllProduct();
	}
	@PostMapping("/Productadd")
	public Product1 product1Add(@RequestBody Product p) {
		return null;
	}
	@DeleteMapping("delProduct/{id}")
	public void delProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}
	

}
