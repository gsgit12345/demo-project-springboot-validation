package com.example.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(collection = "user")
public class Student {
  //  @Id
    private Integer id;

    @NotEmpty(message = "user name is required")
    private String userName;

    @NotNull(message = "user age is required")
    private Integer age;
}