package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 方法说明：
 *
 * @author xiuyuezhi
 * @create 2020/12/12
 */
@SpringBootApplication
@EnableEurekaServer
public class ConsumerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerClientApplication.class, args);
    }

}
