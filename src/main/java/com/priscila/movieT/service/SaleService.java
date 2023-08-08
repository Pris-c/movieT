package com.priscila.movieT.service;


import com.priscila.movieT.controller.response.SaleResponse;
import com.priscila.movieT.entity.Sale;
import com.priscila.movieT.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    @Autowired
    ClientService clientService;

    @Autowired
    PaymentService paymentService;

    public Sale create(Sale sale){
        var client = clientService.findById(sale.getClient().getId());
        var payment = paymentService.findById(sale.getPayment().getId());

        if (client.getId()==null || payment.getId()==null){
            return new Sale();
        }

        return saleRepository.save(sale);
    }

}
