package com.zjc.log;

import com.zjc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zjc on 2017/4/17.
 *
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.delete();
    }
}
