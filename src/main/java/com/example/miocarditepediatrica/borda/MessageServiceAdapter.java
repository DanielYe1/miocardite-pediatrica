package com.example.miocarditepediatrica.borda;

import com.example.miocarditepediatrica.domain.Doctor;
import com.example.miocarditepediatrica.domain.Patient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
class MessageServiceAdapter implements MessageServicePort {

    @Override
    public void processDoctorMessage(String message) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode node = mapper.readTree(message);
            String status = getStatusFromJsonNode(node);
            Doctor doctor = getDoctorFromJsonNode(node);
        } catch (JsonProcessingException e) {
            System.out.println("Erro ao parsear");
        }

    }

    @Override
    public void processPatientMessage(String message) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = null;
        try {
            node = mapper.readTree(message);
            String status = getStatusFromJsonNode(node);
            Patient patient = getPatientFromJsonNode(node);
        } catch (JsonProcessingException e) {
            System.out.println("Erro ao parsear");
        }

    }

    private String getStatusFromJsonNode(JsonNode node) {
        return node.get("status").asText();
    }

    private Doctor getDoctorFromJsonNode(JsonNode node) {
        node = node.get("medico");

        Doctor doctor = new Doctor(
                node.get("id").asText(),
                node.get("nome").asText(),
                node.get("crm").asText(),
                node.get("especialidade").asText(),
                node.get("dataDeNascimento").asText()
        );

        return doctor;
    }

    private Patient getPatientFromJsonNode(JsonNode node) {
        node = node.get("paciente");

        Patient patient = new Patient(
                node.get("id").asText(),
                node.get("nome").asText(),
                node.get("nomeResponsavel").asText(),
                node.get("altura").asText(),
                node.get("peso").asText(),
                node.get("dataDeNascimento").asText()
        );

        System.out.println(patient.toString());

        return patient;
    }
}
