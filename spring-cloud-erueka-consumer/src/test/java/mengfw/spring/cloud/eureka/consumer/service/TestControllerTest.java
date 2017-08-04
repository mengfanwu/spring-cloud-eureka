package mengfw.spring.cloud.eureka.consumer.service;

import org.junit.Test;

/**
 * Created by mengfw on 2017/8/3.
 */
public class TestControllerTest extends BaseWebTest{
    @Test
    public void test() throws Exception {
        printGet("/test");
    }
}
