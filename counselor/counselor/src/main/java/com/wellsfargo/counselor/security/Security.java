package com.wellsfargo.counselor.security;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="security")
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  @Column(nullable = false, length = 100) String name;

    @Column(nullable = false, length = 50)
    private String category;

    // Default constructor required by JPA
    public Security() {}
}
