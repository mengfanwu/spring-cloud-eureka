package mengfw.spring.cloud.eureka.consumer.controller;

import mengfw.spring.cloud.eureka.consumer.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mengfw on 2017/8/3.
 */
@RestController
public class TestController {
    @Autowired
    private ComputeService computeService;
    @RequestMapping(value = "/test")
    public Integer add(){
        return computeService.add(1,2);
    }
}
