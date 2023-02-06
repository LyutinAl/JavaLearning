package com.ltp.gradesubmission;

import java.util.UUID;

public class Grade {
    private String name;
    private String subject;
    private String score;
    private String id;

    


    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String studentName) {
        this.name = studentName;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String suubject) {
        this.subject = suubject;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}