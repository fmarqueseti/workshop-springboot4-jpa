package br.eti.fmarques.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.eti.fmarques.course.entities.User;
import br.eti.fmarques.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Usuário 1", "email1@dominio.com", "988888888", "123456");
        User u2 = new User(null, "Usuário 2", "email2@dominio.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}