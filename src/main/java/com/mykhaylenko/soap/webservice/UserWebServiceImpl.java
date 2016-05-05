package com.mykhaylenko.soap.webservice;

import com.mykhaylenko.fakeservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Pavlo.Mykhaylenko on 4/28/2016.
 */
@WebService(serviceName = "UserWebService")
public class UserWebServiceImpl extends SpringBeanAutowiringSupport implements UserWebService {

    @Autowired
    private UserService userService;

    @WebMethod
    public String getUser(int index){
        return userService.getUser(index);
    }

    @WebMethod
    public void addUser(String username) {
        userService.addUser(username);
    }

    @WebMethod
    public String getFirstUser() {
        return userService.getUser(0);
    }
}
