package ma.imadfaouzi.devoir;

import ma.imadfaouzi.devoir.entities.User;
import ma.imadfaouzi.devoir.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class DevoirApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevoirApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            // Create and save sample creators
            User user0 = User.builder()
                    .name("imad")
                    .email("imad@example.com")
                    .password("imad123")
                    .date_Naissance("11/22/2001")
                    .build();

            User user1 = User.builder()
                    .name("ali")
                    .email("ali@example.com")
                    .password("ali123")
                    .date_Naissance("11/22/1991")
                    .build();


            User user2 = User.builder()
                    .name("azzize")
                    .email("azize@example.com")
                    .password("azize123")
                    .date_Naissance("11/02/2011")
                    .build();


            userRepository.save(user0);
            userRepository.save(user1);
            userRepository.save(user2);

        };
    }
}
