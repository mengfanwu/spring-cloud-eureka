package mengfw.spring.cloud.eureka.consumer.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mengfw on 2017/8/3.
 */
public class ComputeServiceTest extends BaseServiceTest {
    @Autowired
    private ComputeService computeService;

    @Test
    public void add(){
        computeService.add(1,2);
    }
}