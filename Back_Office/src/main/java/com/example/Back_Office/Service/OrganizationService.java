package com.example.Back_Office.Service;

import com.example.Back_Office.Model.Organization;

import java.util.List;

public interface OrganizationService {
    List<Organization> getAllOrganizations();
    Organization getOrganizationById(Long id);
    Organization createOrganization(Organization organization);
    Organization updateOrganization(Long id, Organization organization);
    void deleteOrganization(Long id);
}
