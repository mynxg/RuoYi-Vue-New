package com.ruoyi.demo;

import com.ruoyi.RuoYiApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication
public class RuoYiDemoApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(new Class[]{
                RuoYiDemoApplication.class,
                RuoYiApplication.class
        }, args);
    }
}
