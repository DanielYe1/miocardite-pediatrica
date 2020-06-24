package com.example.miocarditepediatrica.service.messaging;

import com.example.miocarditepediatrica.service.DoctorServicePort;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MessageServiceAdapterTest {

    @InjectMocks
    MessageServiceAdapter messageServiceAdapter;

    @Mock
    DoctorServicePort doctorServicePort;

    @Test
    public void deveria_receber_tratar_payload_corretamente(){
        String payload = "{\"status\":\"delete\",\"medico\":{\"id\": \"1234\", \"nome\": null, \"crm\": null, \"especialidade\": null, \"dataDeNascimento\": null}}";

        messageServiceAdapter.processDoctorMessage(payload);

        verify(doctorServicePort).deleteDoctor("1234");
    }
}