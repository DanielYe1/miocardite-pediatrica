package com.example.miocarditepediatrica.domain.user;

import java.util.List;

class SensibleData {
    private List<String> examIds;
    private String diagnostic;

    SensibleData(List<String> examIds, String diagnostic, List<String> answers) {
        this.examIds = examIds;
        this.diagnostic = diagnostic;
    }

    public List<String> getExamIds() {
        return examIds;
    }

    public String getDiagnostic() {
        return diagnostic;
    }
}
