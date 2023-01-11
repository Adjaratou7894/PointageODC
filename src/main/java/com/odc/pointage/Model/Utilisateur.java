package com.odc.pointage.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table (name = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilisateur", nullable = false)
    private Long idUtilisateur;
    private String nom;
    private String email;
    private String username;
}
