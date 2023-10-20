package br.salao.salaoapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Value;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	//private DBService dbService;
	
	//@Value("${spring.jpa.hibernate.ddl-auto}")
	private String value;
	
	@Bean
	public boolean instanciaDB() {
		if(value.equals("create")) {
		//	this.dbService.instanciaDB();
		}
		return false;
	}

}
