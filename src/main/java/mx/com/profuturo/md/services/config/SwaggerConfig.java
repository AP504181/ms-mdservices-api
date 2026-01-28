package mx.com.profuturo.md.services.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

import java.util.List;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.components(new Components())
				.servers(List.of(
						new Server()
								.url("https://ms-mdservices-api-app.up.railway.app/md-services")
								.description("Railway Production")
				))
				.info(new Info()
						.title("Modificacion Datos MD API")
						.description("Especificación técnica para la modificacion de datos")
						.version("1.0.0"));
	}

}
