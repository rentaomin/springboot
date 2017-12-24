package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import controller.HelloSpringBoot;

/**
 * Spring Boot应用启动类
 *
 * Created by bysocket on 16/4/26.
 */
@SpringBootApplication
public class Application {
	 
	    public static void main(String[] args) {
	        SpringApplication.run(Application.class,args);
	    }
}
