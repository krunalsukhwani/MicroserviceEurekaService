package com.example.MicroserviceEurekaService;

import com.example.MicroserviceEurekaService.Controller.AccountServiceController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicroserviceEurekaServiceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(MicroserviceEurekaServiceApplication.class, args);
		AccountServiceController accountServiceController =
				applicationContext.getBean(AccountServiceController.class);
		System.out.println(accountServiceController);
		accountServiceController.getAccountInformation();
	}

	@Bean
	public AccountServiceController accountServiceController(){
		return new AccountServiceController();
	}
}
