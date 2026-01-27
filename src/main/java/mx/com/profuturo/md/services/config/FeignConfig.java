package mx.com.profuturo.md.services.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class FeignConfig {

	//@Value("${procesar.api.username}")
	//private String username;

	//@Value("${procesar.api.password}")
	//private String codigo;

	//@Bean
	//public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
	//	return new BasicAuthRequestInterceptor(username, codigo);
	//}

	//@Bean
	//Logger.Level feignLoggerLevel() {
		//return Logger.Level.FULL;
	//}

}
