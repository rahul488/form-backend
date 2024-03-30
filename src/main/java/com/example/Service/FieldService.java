package com.example.Service;

import com.example.DTo.FormFieldDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@Service
public class FieldService {

    public List<FormFieldDTO> getAllFields() throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get("src/main/resources/formFields.json"));
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(jsonData+"fffff");
        FormFieldDTO[] data = objectMapper.readValue(jsonData, FormFieldDTO[].class);
    System.out.println(Arrays.toString(data)+""+"sss");
        return Arrays.asList(data);
    }
}
