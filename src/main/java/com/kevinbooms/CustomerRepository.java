package com.kevinbooms;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository
        // uses some Generics. 
        extends JpaRepository<Customer, Integer> {
}
