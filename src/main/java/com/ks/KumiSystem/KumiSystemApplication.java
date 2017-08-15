package com.ks.KumiSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableAutoConfiguration
//@ComponentScan(basePackages = { "com.ks.controllers","com.ks.service"})
@ComponentScan({"com.ks.configuracion","com.ks.controllers","com.ks.service",})

@EntityScan("com.ks.modelo.entities")
@EnableJpaRepositories("com.ks.dao")
public class KumiSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(KumiSystemApplication.class, args);
	}
}
