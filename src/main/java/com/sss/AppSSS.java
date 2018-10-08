package com.sss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppSSS {

    public static void main(String[] args){
        ApplicationContext appContext = SpringApplication.run(AppSSS.class, args);

        System.out.println("Listing all beans in the context: ");
        for(String beanName: appContext.getBeanDefinitionNames()){
            System.out.println(beanName);
        }

    }

}
