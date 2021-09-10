package com.matheusferro.vendasws.repositories;

import com.matheusferro.vendasws.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
