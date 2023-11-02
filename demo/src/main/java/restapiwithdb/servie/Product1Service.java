package restapiwithdb.servie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restapiwithdb.product.Product1;
import restapiwithdb.repository.ProductRepository;

@Service
public class Product1Service {
@Autowired
private ProductRepository productRepository;
public List<Product1> getAllProduct(){
	return productRepository.findAll();
}
public void deleteProduct(int id) {
	productRepository.deleteById(id);
}
}
