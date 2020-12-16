package sun.controller;

import common.utils.CommUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.client.ServiceFeignClient;
import sun.entity.RestfulResult;
import sun.entity.ServiceInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 方法说明：
 *
 * @author xiuyuezhi
 * @create 2020/12/12
 */
@RestController
public class ServiceController {

    @Autowired
    ServiceFeignClient serviceFeignClient;


    @RequestMapping("/consumerService")
    public void consumerService(HttpServletRequest request, HttpServletResponse response,
                                @RequestBody ServiceInfo serviceInfo){
        RestfulResult restfulResult =  serviceFeignClient.hello(serviceInfo);
        CommUtils.printDataJason(response, restfulResult);
    }


}
