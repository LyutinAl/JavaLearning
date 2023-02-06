package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class FormController {
    
    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("user", new User());
        return "form";        
    }

    @PostMapping("/submitItem")
    public String handleTask(@Valid User user, BindingResult result) {
        if (user.getFirstName().equals(user.getLastName())) result.rejectValue("lastName", "", "Please enter valid data");
        
        if (result.hasErrors()) return "form";
        return "redirect:/result";
    }

    @GetMapping("/result")
    public String getResult(Model model) {
        return "result";
        
    }
}
