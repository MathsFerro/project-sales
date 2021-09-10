package com.matheusferro.vendasws.services;

import com.matheusferro.vendasws.dto.SellerDTO;
import com.matheusferro.vendasws.entities.Seller;
import com.matheusferro.vendasws.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll() {
        List<Seller> sellers = sellerRepository.findAll();
        return sellers.stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
