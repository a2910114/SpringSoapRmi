package com.mykhaylenko.rmi.main;

import com.mykhaylenko.rmi.config.RmiConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Pavlo.Mykhaylenko on 4/27/2016.
 */
public class RmiMain {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(RmiConfig.class);
    }
}
