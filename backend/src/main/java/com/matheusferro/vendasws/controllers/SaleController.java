package com.matheusferro.vendasws.controllers;

import com.matheusferro.vendasws.dto.SaleDTO;
import com.matheusferro.vendasws.dto.SellerDTO;
import com.matheusferro.vendasws.services.SaleService;
import com.matheusferro.vendasws.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping("/sales")
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> sales = saleService.findAll(pageable);
        return ResponseEntity.ok(sales);
    }


}
