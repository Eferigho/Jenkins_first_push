package com.jenkins.jenkins;

import com.jenkins.jenkins.com.jenkins.jenkins.area.Triangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsApplication {
    Triangle myTriangle =  new Triangle();
    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }

    @GetMapping("/area")
    public String myTriangleCalculation(){
        return "The Area Of triangle : ".concat(String.valueOf(myTriangle.areaOfTriangle(5,8)));
    }
}
