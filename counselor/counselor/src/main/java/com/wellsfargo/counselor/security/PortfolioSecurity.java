package com.wellsfargo.counselor.security;

import com.wellsfargo.counselor.model.Portfolio;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class PortfolioSecurity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @ManyToOne
    private  @JoinColumn(name = "security_id", nullable = false)Security security;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal purchasePrice;

    @Column(nullable = false, precision = 12, scale = 4)
    private BigDecimal quantity;

    public PortfolioSecurity() {}
}
