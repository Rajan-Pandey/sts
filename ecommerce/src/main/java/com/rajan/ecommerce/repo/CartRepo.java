package com.rajan.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajan.ecommerce.models.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {

}
