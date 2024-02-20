package com.example.demo.com.example.demo;

import com.example.demo.com.example.demo.Fabricante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private FabricanteRepository fabricanteRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            // Crear objeto fabricante
            Fabricante fabrica = new Fabricante("prueba");
            System.out.println("Realizado con éxito");

            // Guardar objeto en la base de datos
            fabricanteRepository.save(fabrica);

            // Imprimir fabricante guardado en la base de datos
            System.out.println("Fabricante: " + fabrica);
        };
    }
}
