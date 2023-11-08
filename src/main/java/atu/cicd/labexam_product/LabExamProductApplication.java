package atu.cicd.labexam_product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LabExamProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabExamProductApplication.class, args);
    }

}
