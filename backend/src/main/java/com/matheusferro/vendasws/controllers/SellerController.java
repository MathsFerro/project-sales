package com.matheusferro.vendasws.controllers;

import com.matheusferro.vendasws.dto.SellerDTO;
import com.matheusferro.vendasws.entities.Seller;
import com.matheusferro.vendasws.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping("/sellers")
    public ResponseEntity<List<SellerDTO>> findAll() {
        List<SellerDTO> sellers = sellerService.findAll();
        return ResponseEntity.ok(sellers);
    }


}
