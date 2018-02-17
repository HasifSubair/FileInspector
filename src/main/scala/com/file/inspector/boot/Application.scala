package com.file.inspector.boot

import com.google.common.base.Predicate
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.{Bean, ComponentScan}
import springfox.documentation.builders.{ApiInfoBuilder, RequestHandlerSelectors}
import springfox.documentation.builders.PathSelectors.regex
import springfox.documentation.service.{ApiInfo, Contact}
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = Array("com.file.inspector.boot.dto", "com.file.inspector.boot.controller"))
class Application

object Application extends App {
  SpringApplication.run(classOf[Application])

  @Bean
  def swaggerPaths(): Predicate[String] = regex("/user.*")

  @Bean def customImplementation = {
    new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo)
      .groupName("default")
      .select
      .apis(RequestHandlerSelectors.basePackage("com.file.inspector.boot.controller")).build
  }

  @Bean
  def apiInfo() = {
    new ApiInfoBuilder()
      .title("File Inspector rest service")
      .description("An rest service documentation for File Inspector Application")
      .contact(new Contact("Hasif Subair", "", ""))
      .version("1.0")
      .build()
  }
}
