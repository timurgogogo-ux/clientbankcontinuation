package com.example.clientbankcontinuation.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Employer extends AbstractEntity {

    private String name;

    private String address;
}