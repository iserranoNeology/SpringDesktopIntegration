package com.example.springbootjfx;

import com.example.springbootjfx.controller.FirstController;
import java.awt.EventQueue;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
@EnableAutoConfiguration
public class SpringbootjfxApplication {
    
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(SpringbootjfxApplication.class).headless(false).run(args);
        EventQueue.invokeLater(()->{
            FirstController fc = ctx.getBean(FirstController.class);
            fc.prepareAndOpenFrame();
        });
    }

}
