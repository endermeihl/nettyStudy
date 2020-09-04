package com.example.nettyStudy.services;

import com.example.nettyStudy.NettyStudyApplication;
import com.example.nettyStudy.tools.SpringBeanTool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {NettyStudyApplication.class})
public class DemoServiceTest implements ApplicationContextAware {

    @Autowired
    private DemoService demoService;

    @Test
    public void test() {
        demoService.doSomething();
        demoService.doSomething2();

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringBeanTool.setApplicationContext(applicationContext);
    }
}