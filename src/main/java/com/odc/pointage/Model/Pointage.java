package com.odc.pointage.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Table
@Data

public class Pointage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpointage", nullable = false)
    private Long idpointage;
    private Date date;
    private Boolean etat;
    private String image;
}
