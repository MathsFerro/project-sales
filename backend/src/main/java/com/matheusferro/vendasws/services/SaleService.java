package com.matheusferro.vendasws.services;

import com.matheusferro.vendasws.dto.SaleDTO;
import com.matheusferro.vendasws.dto.SellerDTO;
import com.matheusferro.vendasws.entities.Sale;
import com.matheusferro.vendasws.entities.Seller;
import com.matheusferro.vendasws.repositories.SaleRepository;
import com.matheusferro.vendasws.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true) // Vai garantir que toda a operação do banco seja feita tudo aqui no service
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();

        Page<Sale> sales = saleRepository.findAll(pageable);
        return sales.map(SaleDTO::new);
    }
}
