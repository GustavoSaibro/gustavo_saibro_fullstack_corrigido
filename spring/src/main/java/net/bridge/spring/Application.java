package net.bridge.spring;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import net.bridge.spring.controller.FatorialController;



@SpringBootApplication
public class Application implements CommandLineRunner {
	
//	private FatorialController ftc = new FatorialController();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}


	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
