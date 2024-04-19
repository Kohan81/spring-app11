package com.kohan81.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * learning spring framework
 */

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean testBean = context.getBean("testBean", TestBean.class);
        testBean.setName("Eugene Jr.");
        System.out.println("my name is: " + testBean.getName());

        context.close();
    }
}
