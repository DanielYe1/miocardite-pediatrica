package com.example.miocarditepediatrica.borda;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @Autowired
    MessageServicePort service;

    @RabbitListener(queues = "${queue.order.name.medico}")
    public void receivedMessage(String message) {
        service.processDoctorMessage(message);
    }

    @RabbitListener(queues = "${queue.order.name.paciente}")
    public void receivedPacientMessage(String message){
        service.processPatientMessage(message);
    }
}
