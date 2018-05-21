package cn.edu.ujn.bugmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@MapperScan("cn.edu.ujn.bugmanagement.mapper")
@EntityScan("cn.edu.ujn.bugmanagement.pojo")
@SpringBootApplication
public class BugmanagementApplication {

    public static void main(String[] args) {

        SpringApplication.run(BugmanagementApplication.class, args);
    }
}
