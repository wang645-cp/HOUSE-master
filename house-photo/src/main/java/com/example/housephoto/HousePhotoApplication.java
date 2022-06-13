package com.example.housephoto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class HousePhotoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HousePhotoApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  程序启动成功   ლ(´ڡ`ლ)ﾞ  \n" );
    }

}
