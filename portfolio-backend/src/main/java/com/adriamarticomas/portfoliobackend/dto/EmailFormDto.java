package com.adriamarticomas.portfoliobackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmailFormDto {
    private String email;
    private String subject;
    private String message;
}
