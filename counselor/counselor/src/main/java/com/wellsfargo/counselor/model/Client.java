package com.wellsfargo.counselor.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String firstName;

    private @Column(nullable = false, length = 50)String lastName;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(length = 20)
    private String phone;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Portfolio portfolio;

    // Default constructor required by JPA
    public Client() {}
 String getFirstName() {
        return firstName;
    }


}
