package com.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

        @GetMapping("/")
public String home() {
    return """
        <html>
        <head>
            <title>DevOps Project</title>
        </head>
        <body style="text-align:center; font-family:Arial; margin-top:100px;">
            <h1 style="font-size:50px; color:#2E86C1;">
                🚀 DevOps CI/CD Pipeline Project
            </h1>
            <h2 style="font-size:30px;">
                Application Running Successfully ✅
            </h2>
            <p style="font-size:20px;">
                Spring Boot | GitHub Actions | Docker | Docker Hub | Render
            </p>
        </body>
        </html>
        """;
}

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}