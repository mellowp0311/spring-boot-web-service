package com.mellowp.webservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket apiDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                // Api Annotation 으로 선언된 부분만 swagger 로 노출되도록 설정
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                .enableUrlTemplating(false)
                .apiInfo(new ApiInfoBuilder()
                                .title("Authority Rest API")
                                .version("0.1")
                                .description("<pre style=\"font-size: .85em;line-height: 1.2em;\">Global Response Entity : <code>{\"code\":{결과코드},\"isOk\":{결과여부},\"message\":{결과메세지},\"body\":{데이터}}</code></pre>")
                                .build()
                );
    }



}
