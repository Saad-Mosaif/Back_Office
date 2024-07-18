package com.example.Back_Office.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Back_Office.Model.Form;
import com.example.Back_Office.Repository.FormRepository;
import com.example.Back_Office.Service.FormService;

import java.util.List;

@Service
public class FormServiceImpl implements FormService {
    @Autowired
    private FormRepository formRepository;

    @Override
    public List<Form> getAllForms() {
        return formRepository.findAll();
    }

    @Override
    public Form getFormById(Long id) {
        return formRepository.findById(id).orElse(null);
    }

    @Override
    public Form createForm(Form form) {
        return formRepository.save(form);
    }

    @Override
    public Form updateForm(Long id, Form form) {
        Form existingForm = formRepository.findById(id).orElse(null);
        if (existingForm != null) {
            existingForm.setContent(form.getContent());
            existingForm.setStatus(form.getStatus());
            existingForm.setEtablissement(form.getEtablissement());
            existingForm.setComplexe(form.getComplexe());
            existingForm.setDirectionRegionale(form.getDirectionRegionale());
            existingForm.setDirectionCentrale(form.getDirectionCentrale());
            existingForm.setSubmittedBy(form.getSubmittedBy());
            return formRepository.save(existingForm);
        }
        return null;
    }

    @Override
    public void deleteForm(Long id) {
        formRepository.deleteById(id);
    }
}
