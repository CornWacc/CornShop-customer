package com.corn.shop;


import com.corn.boot.annotations.Runner;
import com.corn.boot.base.RunMain;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Runner
@ImportResource(value = "dubbo-admin.xml")
@EnableSwagger2
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class Main {

    public static void main(String[] args) {
        RunMain.springRun(Main.class);
    }
}