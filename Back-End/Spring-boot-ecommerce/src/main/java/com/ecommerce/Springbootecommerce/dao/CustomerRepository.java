package com.ecommerce.Springbootecommerce.dao;

import com.ecommerce.Springbootecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
