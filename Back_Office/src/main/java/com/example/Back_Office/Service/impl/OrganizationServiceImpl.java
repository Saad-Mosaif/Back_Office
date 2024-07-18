package com.example.Back_Office.Service.impl;

import java.util.List;

import com.example.Back_Office.Model.Organization;
import com.example.Back_Office.Repository.OrganizationRepository;
import com.example.Back_Office.Service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }

    @Override
    public Organization getOrganizationById(Long id) {
        return organizationRepository.findById(id).orElse(null);
    }

    @Override
    public Organization createOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    @Override
    public Organization updateOrganization(Long id, Organization organization) {
        Organization existingOrganization = organizationRepository.findById(id).orElse(null);
        if (existingOrganization != null) {
            existingOrganization.setName(organization.getName());
            existingOrganization.setType(organization.getType());
            existingOrganization.setParent(organization.getParent());
            return organizationRepository.save(existingOrganization);
        }
        return null;
    }

    @Override
    public void deleteOrganization(Long id) {
        organizationRepository.deleteById(id);
    }
}
