package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 方法说明：
 *
 * @author xiuyuezhi
 * @create 2020/12/12
 */

@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerClientApplication.class,args);
    }
}
