package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld案例
 * @RestController 告诉spring这是一个controller ,并且直接响应返回请求string类型内容
 * 
 */
@RestController
@EnableAutoConfiguration
public class HelloSpringBoot {
	 
	    @RequestMapping("/")
	    public String sayHello() {
	    	System.out.println("hello world");
	        return "Hello,World!";
	    }

	public static void main(String[] args) throws Exception {
	    SpringApplication.run(HelloSpringBoot.class, args);
	}

}