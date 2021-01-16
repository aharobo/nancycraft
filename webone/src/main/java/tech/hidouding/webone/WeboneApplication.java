package tech.hidouding.webone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "tech")
@MapperScan(basePackages = "tech.hidouding.webone")
public class WeboneApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeboneApplication.class, args);
	}

}
