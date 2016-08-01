package br.com.thiago.deixando.seguro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class DeixandoSeguroApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contexto = SpringApplication.run(DeixandoSeguroApplication.class, args);
		for (String nomeDoBean : contexto.getBeanDefinitionNames()) {
			System.out.println(nomeDoBean);
		}
	}
}
