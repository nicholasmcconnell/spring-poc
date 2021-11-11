package com.nickmcconnell.springpoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nickmcconnell.springpoc")//can specify multiple packages using a comma
public class AppConfig {
//    @Bean
//    public Samsung getPhone(){
//        return new Samsung();
//    }
//
//    @Bean
//    public MobileProcessor getProcessor(){
//        return new SnapDragon();
//    }
//
//    @Bean
//    public MobileProcessor getProcessor(){
//        return new MediaTek();
//    }
}
