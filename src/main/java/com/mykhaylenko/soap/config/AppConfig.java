package com.mykhaylenko.soap.config;

import com.mykhaylenko.fakeservice.UserService;
import com.mykhaylenko.fakeservice.UserServiceImpl;
import com.mykhaylenko.soap.webservice.UserWebServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

/**
 * Created by Pavlo.Mykhaylenko on 4/28/2016.
 */
@Configuration
@ComponentScan(basePackages = {"com.mykhaylenko.soap.webservice"})
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public UserWebServiceImpl userWebService() {
        return new UserWebServiceImpl();
    }

    @Bean
    public SimpleJaxWsServiceExporter simpleJaxWsServiceExporter() {
        SimpleJaxWsServiceExporter serviceExporter = new SimpleJaxWsServiceExporter();
        serviceExporter.setBaseAddress("http://localhost:8080/services/");
        return serviceExporter;
    }

}
