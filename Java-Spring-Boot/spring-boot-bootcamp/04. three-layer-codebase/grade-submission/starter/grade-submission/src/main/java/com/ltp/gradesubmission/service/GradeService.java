package com.ltp.gradesubmission.service;

import java.util.List;

import com.ltp.gradesubmission.Constants;
import com.ltp.gradesubmission.Grade;
import com.ltp.gradesubmission.repository.GradeRepository;

public class GradeService {
    
    GradeRepository gradeRepository = new GradeRepository();

    public Grade getGrade(int index) {
        return gradeRepository.getGrade(index);
    }

    public void addGrade(Grade grade) {
        gradeRepository.addGrade(grade);
    }

    public void updateGrade(int index, Grade grade) {
        gradeRepository.updateGrade(index, grade);
    }

    public List<Grade> getGrades() {
        return gradeRepository.getGrades();
    }

    public int getIndex(String id) {
        for (int i = 0; i < getGrades().size(); i++) {
            if (getGrades().get(i).getId().equals(id)) return i;
        }
        return Constants.NOT_FOUND;
    }

    public Grade getGradeById(String id) {
        int index = getIndex(id);
        return index == Constants.NOT_FOUND ? new Grade() : getGrade(index);
    }

    public void submitGrade(Grade grade) {
        int index = getIndex(grade.getId());
        if (index == Constants.NOT_FOUND) {
            addGrade(grade);
        } else {
            updateGrade(index, grade);
        }
    }
}