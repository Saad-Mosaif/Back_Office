package com.example.Back_Office.Service;

import com.example.Back_Office.Model.Form;

import java.util.List;


public interface FormService {
    List<Form> getAllForms();
    Form getFormById(Long id);
    Form createForm(Form form);
    Form updateForm(Long id, Form form);
    void deleteForm(Long id);
}
