package com.example.DTo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormFieldDTO {

     private String name;
     private String label;
     private String type;

     private String placeholder;

     private boolean required;

     private Integer minLength;

     private Integer maxLength;

     private String errorMessage;
}
