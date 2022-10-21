package com.Ecommerce.Ecommerce.dao;

import com.Ecommerce.Ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-Category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
