package com.mykhaylenko.soap.webservice;

import javax.jws.WebService;

/**
 * Created by Pavlo.Mykhaylenko on 4/28/2016.
 */
//@WebService(serviceName = "UserWebService")
public interface UserWebService {

    String getUser(int index);

    void addUser(String username);
}
