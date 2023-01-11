package com.odc.pointage.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "permission")
public class DemandePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpermission", nullable = false)
    private Long idpermission;
    private Date dateSoumission;
    private Date dateDebut;
    private Date dateFin;
    private String duree;
    private String motif;
    private String statut;




}
