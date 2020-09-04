package com.example.nettyStudy;

import com.example.nettyStudy.tools.SpringBeanTool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NettyStudyApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(NettyStudyApplication.class, args);
        SpringBeanTool.setApplicationContext(context);
    }

}
