
package com.kilo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IbatisTesterDriver {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext(
                "classpath:com/kilo/applicationContext.xml",
                "classpath:com/kilo/logging.xml");

    }

}
