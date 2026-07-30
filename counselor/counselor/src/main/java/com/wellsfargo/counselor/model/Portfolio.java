package com.wellsfargo.counselor.model;

import com.wellsfargo.counselor.security.PortfolioSecurity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name="portfolio")
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private@Column(nullable = false, length = 100) String portfolioName;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PortfolioSecurity> portfolioSecurities;

    public Portfolio() {

    }
}