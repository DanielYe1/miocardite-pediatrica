package com.example.miocarditepediatrica.domain.decisiontree;

import java.util.List;

public class DecisionTreeNode {
    private String id;
    private String type;
    private String text;
    private List<String> possibleValues;

    public DecisionTreeNode(String id, String type, String text, List<String> possibleValues) {
        this.id = id;
        this.type = type;
        this.text = text;
        this.possibleValues = possibleValues;
    }

    public DecisionTreeNode() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(List<String> possibleValues) {
        this.possibleValues = possibleValues;
    }
}
