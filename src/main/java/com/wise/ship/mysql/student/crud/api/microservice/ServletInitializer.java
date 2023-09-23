package com.wise.ship.mysql.student.crud.api.microservice;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WIseShipWorksMySQLStudentCRUDApiMSAppn.class);
    }

}
