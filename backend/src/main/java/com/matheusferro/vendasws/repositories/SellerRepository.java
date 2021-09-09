package com.matheusferro.vendasws.repositories;

import com.matheusferro.vendasws.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
