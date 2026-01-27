package mx.com.profuturo.md.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsMdServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMdServicesApplication.class, args);
	}

}
