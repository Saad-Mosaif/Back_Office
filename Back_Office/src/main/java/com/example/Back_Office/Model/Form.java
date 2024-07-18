package com.example.Back_Office.Model;

import com.example.Back_Office.Model.Organization;
import com.example.Back_Office.Model.User;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content; // Add this field if needed
    private String status;

    @ManyToOne
    @JoinColumn(name = "etablissement_id")
    private Organization etablissement;

    @ManyToOne
    @JoinColumn(name = "complexe_id")
    private Organization complexe;

    @ManyToOne
    @JoinColumn(name = "directionRegionale_id")
    private Organization directionRegionale;

    @ManyToOne
    @JoinColumn(name = "directionCentrale_id")
    private Organization directionCentrale;

    @ManyToOne
    @JoinColumn(name = "submittedBy_id")
    private User submittedBy;
}
