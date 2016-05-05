package com.mykhaylenko.rmi.config;

import com.mykhaylenko.fakeservice.UserService;
import com.mykhaylenko.fakeservice.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * Created by Pavlo.Mykhaylenko on 4/28/2016.
 */
public class RmiConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public RmiServiceExporter rmiServiceExporter(UserService userService) {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setService(userService);
        rmiServiceExporter.setServiceName("UserService");
        rmiServiceExporter.setServiceInterface(UserService.class);

        return rmiServiceExporter;
    }
}
