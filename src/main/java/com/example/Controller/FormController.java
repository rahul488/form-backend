package com.example.Controller;

import com.example.DTo.FormFieldDTO;
import com.example.Service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/form")
@CrossOrigin(origins = "*")
public class FormController {

    @Autowired
    private FieldService fieldService;

    @GetMapping("/getFormFields")
    public ResponseEntity<List<FormFieldDTO>> getFields() throws IOException {
        return  new ResponseEntity<>(fieldService.getAllFields(), HttpStatus.OK);
    }
}
