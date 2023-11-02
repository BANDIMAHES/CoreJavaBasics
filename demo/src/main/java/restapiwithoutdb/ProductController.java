package restapiwithoutdb;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	@GetMapping("/all")
	public List<Product> getProduct() {
		return ProductService.getProductDetails();
	}
	//http://localhost:8080/product/getbyid/2
	@GetMapping("/getbyid/{id}")
	public Product getProductById(@PathVariable int id) {
		return ProductService.getProductById(id);
	}
	//http://localhost:8080/product/getbyid?id=2
	@GetMapping("/getbyid")
	public Product getProductId(@RequestParam int id) {
		return ProductService.getProductById(id);
	}
	//http://localhost:8080/product/add
//	{
//        "pname": "Laptop",
//        "price": 10000
//}
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product p) {
		return ProductService.addProduct(p);
	}
	@DeleteMapping("/delete/{id}")
	public Product dlProduct(@PathVariable int id) {
		return ProductService.deleteProduct(id);
	}
	@PutMapping("/update/{id}")
	public Product updateProduct(@PathVariable int id,@RequestBody Product p) {
		
		return ProductService.updateProduct(id,p);
	}
	
	

}
