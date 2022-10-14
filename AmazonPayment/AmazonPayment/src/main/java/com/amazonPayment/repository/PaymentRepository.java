package com.amazonPayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazonPayment.model.Payments;

public interface PaymentRepository extends JpaRepository<Payments, Long>{

}
