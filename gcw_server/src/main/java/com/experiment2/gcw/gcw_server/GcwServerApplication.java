package com.experiment2.gcw.gcw_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.experiment2.gcw.gcw_server.mapper")
public class GcwServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GcwServerApplication.class, args);
    }

}
