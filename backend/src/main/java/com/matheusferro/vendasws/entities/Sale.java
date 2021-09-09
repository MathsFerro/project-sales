package com.matheusferro.vendasws.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_sales")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer visited;

    private Integer deals;

    private Double amount;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Objects.equals(id, sale.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
