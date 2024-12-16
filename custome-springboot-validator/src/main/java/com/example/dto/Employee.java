package com.example.dto;

import com.example.validator.ValidateAccountType;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    //it should auto generate
    private int empId;
    @NotBlank(message = "firstName shouldn't be null or empty")
    private String firstName;
    @NotBlank(message = "lastName shouldn't be null or empty")
    private String lastName;
    @Past(message = "start shouldn't be before current date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date doj;
    @NotNull(message = "department shouldn't be null")
    @NotEmpty(message = "department shouldn't be empty")
    private String dept;
    @Email(message = "invalid email id")
    private String email;

    //custom annotation
    @ValidateAccountType
    private String accountType; //saving or current
}