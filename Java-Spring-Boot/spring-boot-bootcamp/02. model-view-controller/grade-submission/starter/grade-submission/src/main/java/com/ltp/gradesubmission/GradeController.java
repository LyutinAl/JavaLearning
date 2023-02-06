package com.ltp.gradesubmission;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GradeController {
    List<Grade> gradesList = new ArrayList<>();

    @GetMapping("/")
    public String setGrade(Model model, @RequestParam(required = false) String id) {
        model.addAttribute("grade", getIndex(id) == Constants.NOT_FINDE ? new Grade() : gradesList.get(getIndex(id)));
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(Grade grade) {
        int index = getIndex(grade.getId());
        if (index == Constants.NOT_FINDE) {
            gradesList.add(grade);
        } else {
            gradesList.set(index, grade);
        }        
        return "redirect:/grades";
    }

    @GetMapping("/grades")
    public String getGrades(Model model) {
        // Grade grade = new Grade("Harry", "Potions", "C-");
        model.addAttribute("grades", gradesList);
        return "grades";
    }

    public int getIndex(String id) {
        for (int i = 0; i < gradesList.size(); i++) {
            if (gradesList.get(i).getId().equals(id)) return i;
        }
        return Constants.NOT_FINDE;
    }
}
