package com.tyss.productmanagement.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tyss.productmanagement.beans.Product;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer>{
	@Modifying
	@Query("update Product set quantity=:quantity, details=:details, imageUrl=:imageUrl where id=:id")
	public int update(@Param("quantity")int quantity, @Param("details")String details, @Param("imageUrl")String imagUrl, @Param("id")int id);	
	
	public Product findByName(String name);
}
