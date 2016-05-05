package com.mykhaylenko.soap.client;

import com.mykhaylenko.soap.config.WSClientConfig;
import com.mykhaylenko.soap.webservice.UserWebServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

/**
 * Created by Pavlo.Mykhaylenko on 4/28/2016.
 */
public class WsClientMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(WSClientConfig.class);
//        UserWebServiceImpl userWebServiceImpl = (UserWebServiceImpl) applicationContext.getBean("UserWebService");
//        System.out.println(userWebServiceImpl.getFirstUser());
        JaxWsPortProxyFactoryBean bean = applicationContext.getBean(JaxWsPortProxyFactoryBean.class);
        bean.createJaxWsService();
    }
}
