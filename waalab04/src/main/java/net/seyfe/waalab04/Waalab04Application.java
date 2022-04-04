package net.seyfe.waalab04;

import net.seyfe.waalab04.domain.Exception;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Waalab04Application {

	public static void main(String[] args) {
		SpringApplication.run(Waalab04Application.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
