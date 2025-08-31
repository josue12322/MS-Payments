package com.payments.hrpay.service;

import com.payments.hrpay.entities.Payment;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class PaymentService {
    public Payment getPayment(Long id, int days) {
        return new Payment("Bob", 200.0, days);
    }
}
