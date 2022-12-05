package com.ecommerce.Springbootecommerce.dto;

import com.ecommerce.Springbootecommerce.entity.Address;
import com.ecommerce.Springbootecommerce.entity.Customer;
import com.ecommerce.Springbootecommerce.entity.Order;
import com.ecommerce.Springbootecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
