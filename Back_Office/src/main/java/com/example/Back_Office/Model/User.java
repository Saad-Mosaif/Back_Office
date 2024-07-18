package com.example.Back_Office.Model;



import com.example.Back_Office.Model.Organization;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role; // directeur centrale, directeur regionale, directeur de complexe, directeur d'etablissment

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
}
