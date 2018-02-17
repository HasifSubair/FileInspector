package com.file.inspector.boot

import com.google.common.base.Predicate
import org.springframework.context.annotation.{Bean, Configuration}
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors.regex
import springfox.documentation.service.{ApiInfo, Contact}
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {
  @Bean
  def swaggerPaths(): Predicate[String] = regex("/user.*")

  @Bean
  def apiInfo(): ApiInfo = {
    new ApiInfoBuilder()
      .title("File Inspector rest service")
      .description("user registration API")
      .contact(new Contact("Hasif Subair", "",""))
      .version("1.0")
      .build()
  }
}
