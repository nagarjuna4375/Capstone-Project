package com.ecommerce.Springbootecommerce.service;


import com.ecommerce.Springbootecommerce.dao.CustomerRepository;
import com.ecommerce.Springbootecommerce.dto.Purchase;
import com.ecommerce.Springbootecommerce.dto.PurchaseResponse;
import com.ecommerce.Springbootecommerce.entity.Customer;
import com.ecommerce.Springbootecommerce.entity.Order;
import com.ecommerce.Springbootecommerce.entity.OrderItem;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {


        Order order = purchase.getOrder();


        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);


        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(item -> order.add(item));


        order.setBillingAddress(purchase.getBillingAddress());
        order.setShippingAddress(purchase.getShippingAddress());


        Customer customer = purchase.getCustomer();


        String theEmail = customer.getEmail();

        Customer customerFromDB = customerRepository.findByEmail(theEmail);

        if (customerFromDB != null) {
            // we found them ... let's assign them accordingly
            customer = customerFromDB;
        }

        customer.add(order);


        customerRepository.save(customer);


        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {


        return UUID.randomUUID().toString();
    }
}