package com.jenkins.jenkins;
import com.jenkins.jenkins.com.jenkins.jenkins.area.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {
    Triangle myTriangle = new Triangle();


    @Test
    void contextLoads() {
    }
    @Test
    void calculateAreaOfTriangle(){
        Assertions.assertEquals(12, myTriangle.areaOfTriangle(6,4));
    }


}
