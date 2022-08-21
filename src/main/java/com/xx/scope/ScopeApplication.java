package com.xx.scope;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.xx.scope.*.mapper")
//@EnableTransactionManagement
//@EnableAspectJAutoProxy(exposeProxy = true)
@EnableTransactionManagement
public class ScopeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScopeApplication.class, args);
    }
}

