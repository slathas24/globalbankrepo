package in.brainupgrade.authenticationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The AuthenticationMsApplication class to start the application
 *
 */
@SpringBootApplication
@EnableSwagger2
public class AuthenticationMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationMsApplication.class, args);
	}

	/**
	 * Swagger configuration
	 * 
	 * @return
	 */
	@Bean
	public Docket swaggerConfiguration() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("in.brainupgrade.authenticationservice.controller")).build();

	}

}
