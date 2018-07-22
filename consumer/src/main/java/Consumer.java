/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-20 19:25
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        Hello sayHello = (Hello) ctx.getBean("hello");
        String s = sayHello.sayHello("lydia");
        System.out.println(s);
    }
}
