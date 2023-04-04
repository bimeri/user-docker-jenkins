package com.bimerinoel.docker.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Bimeri Noel
 * @date 4/4/2023
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

 @Bean
 public Docket docket(){
  return new Docket(DocumentationType.SWAGGER_2).select().build();
 }
}
