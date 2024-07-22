package com.nft.BanTranhNFT.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name", nullable = false, length = 100)
    private String userName;

    @Column(name = "user_email", nullable = false, unique = true, length = 100)
    private String userEmail;

    @Column(name = "user_password", nullable = false, length = 100)
    private String userPassword;

    @Column(name = "user_address", length = 255)
    private String userAddress;

    @Column(name = "phone", length = 15)
    private String phone;

    @Column(name = "role", nullable = false, length = 50)
    private String role;

    @OneToMany(mappedBy = "artist")
    private List<Painting> paintings;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}
