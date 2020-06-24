package com.example.miocarditepediatrica.domain.decisiontree;

import java.util.Collections;
import java.util.List;

public class DecisionTreeAnswer {
    private String treeName;
    private String questionId;
    private List<String> answers;

    public DecisionTreeAnswer(String treeName, String questionId, String answers) {
        this.treeName = treeName;
        this.questionId = questionId;
        this.answers = Collections.singletonList(answers);
    }

    public DecisionTreeAnswer() {
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = Collections.singletonList(answers);
    }
}
