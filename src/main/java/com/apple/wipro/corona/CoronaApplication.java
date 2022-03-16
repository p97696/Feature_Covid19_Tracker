package com.apple.wipro.corona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring5.SpringTemplateEngine;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import nz.net.ultraq.thymeleaf.LayoutDialect;

@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
//@EnableZuulProxy
@OpenAPIDefinition(info = @Info(title = "Covid19 API", version = "2.0", description = "Covid19 Tracking Information"))
@ComponentScan(basePackages={"com.apple.wipro.corona"})
public class CoronaApplication {
	public static void main(String args[]) {
		SpringTemplateEngine engine = new SpringTemplateEngine();
		engine.addDialect(new LayoutDialect());
		SpringApplication.run(CoronaApplication.class, args);
	}
}
