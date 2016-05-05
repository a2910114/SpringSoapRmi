package com.mykhaylenko.soap.config;

import com.mykhaylenko.soap.webservice.UserWebServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Pavlo.Mykhaylenko on 4/28/2016.
 */
@Configuration
public class WSClientConfig {

    @Bean
    public JaxWsPortProxyFactoryBean jaxWsPortProxyFactoryBean() throws MalformedURLException {
        JaxWsPortProxyFactoryBean proxy = new JaxWsPortProxyFactoryBean();
        proxy.setWsdlDocumentUrl(new URL("http://localhost:8080/services/UserWebService?wsdl"));
        proxy.setServiceName("UserWebService");
        proxy.setPortName("UserWebServiceImplPort");
        proxy.setServiceInterface(UserWebServiceImpl.class);

        proxy.setNamespaceUri("http://webservice.soap.mykhaylenko.com/");
        return proxy;
    }
}
