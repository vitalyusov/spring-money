package vit.money;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public CommandLineRunner demo(AccountRepository repository) {
        return (args) -> {
            
            repository.save(new Account("Jack", "Bauer"));
            repository.save(new Account("Chloe", "O'Brian"));
            
           
            log.info("-------------------------------");
            for (Account account : repository.findAll()) {
                log.info(account.toString());
            }
            log.info("");

            
            Account acc = repository.findOne(1L);
            log.info("Account found with findOne(1L):");
            log.info("--------------------------------");
            log.info(acc.toString());
            log.info("");

            
            log.info("Account found with findByName");
            log.info("--------------------------------------------");
            for (Account account : repository.findByName("Chloe")) {
                log.info(account.toString());
            }
            log.info("");
        };
    }
}