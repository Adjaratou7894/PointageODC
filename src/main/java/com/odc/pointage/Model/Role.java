package com.odc.pointage.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrole", nullable = false)
    private Long idrole;
    private  String nomrole;

}
