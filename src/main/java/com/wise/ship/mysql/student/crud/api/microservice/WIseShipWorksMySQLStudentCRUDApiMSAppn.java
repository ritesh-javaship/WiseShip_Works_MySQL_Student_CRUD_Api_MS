package com.wise.ship.mysql.student.crud.api.microservice;

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
public class WIseShipWorksMySQLStudentCRUDApiMSAppn {

    public static void main(String[] args) {
        SpringApplication.run(WIseShipWorksMySQLStudentCRUDApiMSAppn.class, args);
    }

}
