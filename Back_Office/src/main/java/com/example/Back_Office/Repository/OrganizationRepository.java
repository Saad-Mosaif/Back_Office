package com.example.Back_Office.Repository;

import com.example.Back_Office.Model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
