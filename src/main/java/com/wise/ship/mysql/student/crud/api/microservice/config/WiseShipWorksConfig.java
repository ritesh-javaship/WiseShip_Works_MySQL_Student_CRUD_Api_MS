package com.wise.ship.mysql.student.crud.api.microservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@Configuration
public class WiseShipWorksConfig {

    private static String PROP_DB_DRIVER_CLASS = "spring.db.driver";
    private static String PROP_DB_URL = "spring.datasource.url";
    private static String PROP_DB_USER = "spring.datasource.username";
    private static String PROP_DB_PASS = "spring.datasource.password";

    @Autowired
    private Environment env;

    /*@Autowired
    private JdbcEnvironment jdbcEnv = new JdbcEnvironmentImpl(env);*/

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty(PROP_DB_DRIVER_CLASS));
        dataSource.setUrl(env.getProperty(PROP_DB_URL));
        dataSource.setUsername(env.getProperty(PROP_DB_USER));
        dataSource.setPassword(env.getProperty(PROP_DB_PASS));
        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan("com.wise.ship.mysql.student.crud.api.microservice");

        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);

        return em;
    }

}
