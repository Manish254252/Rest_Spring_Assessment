package com.example.HikeOn.repository;

import com.example.HikeOn.model.Customer;
import com.example.HikeOn.model.Occupation;
import com.example.HikeOn.model.CustomerGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    boolean existsByOccupationAndDobAndCustomerGroup(Occupation occupation, LocalDate dob, CustomerGroup customerGroup);

    Optional<Customer> findByEmail(String email);

    boolean existsByEmail(String email);
    // Other query methods as needed
}
