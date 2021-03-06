package com.example.nettyStudy.services;

import com.example.nettyStudy.annotation.DataSource;
import com.example.nettyStudy.enums.DataSourceEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TypeOneService implements IBaseService {

    protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Override
    @DataSource(DataSourceEnum.DB2)
    public void test() {
        logger.info("this class:-{}", this.getClass());
    }

    @DataSource(DataSourceEnum.DB1)
    public void test2() {
        logger.info("this class:-{}", this.getClass());
    }
}
