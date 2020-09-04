package com.example.nettyStudy.services;

import com.example.nettyStudy.tools.SpringBeanTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class DemoService {
    protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public void doSomething() {
        logger.info("hello world");
        String[] beanNames = SpringBeanTool.getApplicationContext().getBeanNamesForType(TypeOneService.class);
        TypeOneService typeOneService = (TypeOneService) SpringBeanTool.getApplicationContext().getBean(beanNames[0]);
        //typeOneService.test();
        logger.info("beans:{}", typeOneService);
    }

    public void doSomething2() {
        logger.info("hello world");
        String[] beanNames = SpringBeanTool.getApplicationContext().getBeanNamesForType(TypeTwoService.class);
        TypeTwoService typeTwoService = (TypeTwoService) SpringBeanTool.getApplicationContext().getBean("typeTwoService");
        typeTwoService.test();
        logger.info("beans:{}", typeTwoService);
    }
}
