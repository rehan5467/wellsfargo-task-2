package com.wellsfargo.counselor.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Getter
@Setter

public class Advisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String firstName;

    private  @Column(nullable = false, length = 50) String lastName;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL)
    private List<Client> clients;

    public Advisor() {

    }
}
