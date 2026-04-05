package com.example.clientbankcontinuation.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Account extends AbstractEntity {

    private Double balance;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}