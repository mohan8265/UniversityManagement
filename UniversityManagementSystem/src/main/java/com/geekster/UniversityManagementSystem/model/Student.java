package com.geekster.UniversityManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private Long studentId;
    //@Pattern(regexp = "^[A-Z].*");
    private String firstName;
    private String lastName;
    @Min(value = 18, message = "age must be 18 to 25")
    @Max(value = 25, message = "age must be 18 to 25")
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Department department;
}
