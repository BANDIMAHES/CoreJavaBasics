package restapiwithdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import restapiwithdb.product.Product1;

public interface ProductRepository extends JpaRepository<Product1, Integer>{

}
