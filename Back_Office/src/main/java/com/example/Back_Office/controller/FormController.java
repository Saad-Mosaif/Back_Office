package com.example.Back_Office.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.Back_Office.Model.Form;
import com.example.Back_Office.Service.FormService;

@RestController
@RequestMapping("/api/forms")
public class FormController {
    @Autowired
    private FormService formService;

    @GetMapping
    public List<Form> getAllForms() {
        return formService.getAllForms();
    }

    @GetMapping("/{id}")
    public Form getFormById(@PathVariable Long id) {
        return formService.getFormById(id);
    }

    @PostMapping
    public Form createForm(@RequestBody Form form) {
        return formService.createForm(form);
    }

    @PutMapping("/{id}")
    public Form updateForm(@PathVariable Long id, @RequestBody Form form) {
        return formService.updateForm(id, form);
    }

    @DeleteMapping("/{id}")
    public void deleteForm(@PathVariable Long id) {
        formService.deleteForm(id);
    }
}
