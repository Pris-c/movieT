package com.priscila.movieT.controller;

import com.priscila.movieT.controller.request.SaleRequest;
import com.priscila.movieT.controller.response.SaleResponse;
import com.priscila.movieT.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    SaleService saleService;



    @PostMapping
    public SaleResponse create(@RequestBody SaleRequest saleRequest){
        var sale = saleRequest.getSale();
        sale = saleService.create(sale);

        if (sale.getId()==null){
            return SaleResponse.getEmptySale();
        }
        return SaleResponse.valueOf(sale);
    }
}
