package com.payments.hrpay.service;

import com.payments.hrpay.client.WorkerClient;
import com.payments.hrpay.entities.Payment;
import com.payments.hrpay.entities.Worker;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class PaymentService {

    @Autowired
    private WorkerClient workerClient;
    public Payment getPayment(Long workerId, int days){
        Worker worker = workerClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
