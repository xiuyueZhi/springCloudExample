package sun.client;

import org.springframework.stereotype.Component;
import sun.entity.RestfulResult;
import sun.entity.ServiceInfo;

/**
 * 方法说明：
 *
 * @author xiuyuezhi
 * @create 2020/12/16
 */
@Component
public class ServiceFallback  implements ServiceFeignClient {
    @Override
    public RestfulResult hello(ServiceInfo serviceInfo) {
        RestfulResult result = new RestfulResult();
        result.setData("服务调用失败");
        return result;

    }
}
