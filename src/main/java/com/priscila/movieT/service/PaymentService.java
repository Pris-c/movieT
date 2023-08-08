package com.priscila.movieT.service;

import com.priscila.movieT.entity.Payment;
import com.priscila.movieT.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public Payment create(Payment payment){
        return paymentRepository.save(payment);
    }

    public Payment findById(UUID paymentId){
        Optional<Payment> optionalPayment = paymentRepository.findById(paymentId);
        return optionalPayment.orElse(new Payment());
    }



}
