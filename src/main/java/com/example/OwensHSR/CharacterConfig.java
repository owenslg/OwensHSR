package com.example.OwensHSR;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CharacterConfig {

    @Bean
    CommandLineRunner commandLineRunner(CharacterRepository repository)
    {
        return args ->
        {
             Character welt = new Character(
                    "welt",
                     "Nihility",
                     5,
                     "Imaginary",
                     "The Nameless"
            );

            Character himeko = new Character(
                    "himeko",
                    "Erudition",
                    5,
                    "Fire",
                    "The Nameless"
            );

            repository.saveAll(List.of(welt, himeko));
        };
    }
}
