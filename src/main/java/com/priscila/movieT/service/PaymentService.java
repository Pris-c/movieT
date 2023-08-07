package com.priscila.movieT.service;

import com.priscila.movieT.entity.Payment;
import com.priscila.movieT.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public Payment create(Payment payment){
        return paymentRepository.save(payment);
    }



}
