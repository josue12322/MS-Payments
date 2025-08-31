package com.payments.hrpay.repository;

import com.payments.hrpay.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRespository  extends JpaRepository<Payment, Long> {
}
