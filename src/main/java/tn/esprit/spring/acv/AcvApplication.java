package tn.esprit.spring.acv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients
@Configuration
@ComponentScan("tn.esprit.spring")
@EnableSwagger2
public class AcvApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcvApplication.class, args);
    }

}
