package com.example.miocarditepediatrica.domain.user;

import java.util.List;

public class SensibleData {
    private List<String> examIds;
    private String diagnostic;
    private List<String> answers;

    public SensibleData(List<String> examIds, String diagnostic, List<String> answers) {
        this.examIds = examIds;
        this.diagnostic = diagnostic;
        this.answers = answers;
    }

    public List<String> getExamIds() {
        return examIds;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public List<String> getAnswers() {
        return answers;
    }
}
