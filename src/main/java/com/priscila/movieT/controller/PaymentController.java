package com.priscila.movieT.controller;

import com.priscila.movieT.controller.request.PaymentRequest;
import com.priscila.movieT.controller.response.PaymentResponse;
import com.priscila.movieT.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping
    public PaymentResponse create(@RequestBody PaymentRequest paymentRequest){
        var payment = paymentRequest.getPayment();
        payment = paymentService.create(payment);
        return PaymentResponse.valueOf(payment);
    }




}
