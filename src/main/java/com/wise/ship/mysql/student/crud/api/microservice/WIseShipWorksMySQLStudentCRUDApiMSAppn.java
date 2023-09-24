package com.wise.ship.mysql.student.crud.api.microservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = {"com.wise.ship.mysql.student.crud.api.microservice"},
    exclude = {DataSourceAutoConfiguration.class, BatchAutoConfiguration.class, SecurityAutoConfiguration.class})
@EntityScan
@EnableJpaRepositories
@EnableWebMvc
@OpenAPIDefinition(
        info=@Info(
           title = "Ritesh Developed MicroServices",
           description = "RiteShip Accoutns MicroServices Ltd",
           version = "v1",
           contact = @Contact(
                   name = "Ritesh Chawla",
                   email = "ritesh.chawla.iit@gmail.com",
                   url = "https://riteshsirontheway.com"
           ),
           license = @License(
                        name = "Apache 2.0",
                        url = "https://riteshchawlaontheway.com"
           )
        ),
        externalDocs = @ExternalDocumentation(
                description = "ABCDZ",
                url = "https://riteshchawlaontheway.com"
        )

)
public class WIseShipWorksMySQLStudentCRUDApiMSAppn {

    public static void main(String[] args) {
        SpringApplication.run(WIseShipWorksMySQLStudentCRUDApiMSAppn.class, args);
    }

}
