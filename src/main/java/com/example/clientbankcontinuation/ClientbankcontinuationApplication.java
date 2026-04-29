package com.example.clientbankcontinuation;
import com.example.clientbankcontinuation.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.example.clientbankcontinuation.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.example.clientbankcontinuation.repository.UserRepository;
import com.example.clientbankcontinuation.model.User;
@EnableJpaAuditing
@SpringBootApplication
public class ClientbankcontinuationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientbankcontinuationApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
    @Bean
    CommandLineRunner run(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            User user = new User();
            user.setUsername("admin");
            user.setPassword(passwordEncoder.encode("1234"));
            userRepository.save(user);
        };
    }
        }

