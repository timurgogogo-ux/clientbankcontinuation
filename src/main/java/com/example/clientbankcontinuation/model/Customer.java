package com.example.clientbankcontinuation.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Customer extends AbstractEntity {

    private String name;

    private int age;

    private String email;

    private String phone;

    private String password;
    @OneToMany(mappedBy = "customer")
    private List<Account> accounts;
}