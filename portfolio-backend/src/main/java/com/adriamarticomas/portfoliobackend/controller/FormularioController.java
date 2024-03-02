package com.adriamarticomas.portfoliobackend.controller;

import com.adriamarticomas.portfoliobackend.dto.EmailFormDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apiAdri")
public class FormularioController {

    @Autowired
    private JavaMailSender mailSender;

    @PostMapping("/enviar")
    public void enviarEmail(@RequestBody EmailFormDto emailFormDto) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("adriamarticomas@gmail.com");
        message.setSubject("Email desde portfolio! " + emailFormDto.getSubject());
        message.setText("Asunto: " + emailFormDto.getSubject() + "\nEnviado por: " + emailFormDto.getEmail() + "\nMensaje:\n" + emailFormDto.getMessage());
        mailSender.send(message);
        System.out.println("Email enviado correctamente");

    }
}
