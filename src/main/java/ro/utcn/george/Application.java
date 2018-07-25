package ro.utcn.george;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing	
@ComponentScan("ro.utcn.george")	
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
