package com.example.Back_Office.Model;



import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type; // Direction Centrale, Direction Regionale, Complexe, Etablissement

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Organization parent;

    @OneToMany(mappedBy = "parent")
    private List<Organization> children;

    @OneToMany(mappedBy = "organization")
    private List<User> users;
}
