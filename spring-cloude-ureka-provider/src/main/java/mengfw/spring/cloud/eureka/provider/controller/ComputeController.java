package mengfw.spring.cloud.eureka.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mengfw on 2017/8/2.
 */
@RestController
public class ComputeController {

    @Autowired
    private DiscoveryClient client;
    @RequestMapping(value = "/add")
    private Integer add(@RequestParam Integer a, @RequestParam  Integer b){
        return  a + b;
    }
}
