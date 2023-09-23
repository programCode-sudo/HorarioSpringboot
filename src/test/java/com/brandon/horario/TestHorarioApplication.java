package com.brandon.horario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestHorarioApplication {

	public static void main(String[] args) {
		SpringApplication.from(HorarioApplication::main).with(TestHorarioApplication.class).run(args);
	}

}
