package com.odc.pointage.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table

public class PlaningNotification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnotif", nullable = false)
    private Long idnotification;
    private Long periode;
    private String message;
}
