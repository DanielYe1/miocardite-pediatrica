package com.example.miocarditepediatrica.out.controller;

import com.example.miocarditepediatrica.domain.decisiontree.DecisionTreeAnswer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

@RestController
@RequestMapping("/tree")
@CrossOrigin
public class DecisionTreeController {

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public ResponseEntity showTest(@Valid DecisionTreeAnswer answer){
        answer.setTreeName("miocardite-pediatrica");
        RestTemplate template = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String treeNode = template.postForObject("http://localhost:8080/node", answer, String.class);
        return new ResponseEntity(treeNode, HttpStatus.OK);
    }


}

