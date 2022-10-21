package com.Ecommerce.Ecommerce.dao;

import com.Ecommerce.Ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
