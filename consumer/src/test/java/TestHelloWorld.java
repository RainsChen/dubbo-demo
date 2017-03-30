import com.demo.api.HelloWorldApi;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Chenjie on 2017/3/29.
 */
public class TestHelloWorld  {
    private HelloWorldApi helloWorldApi;

    @Before
    public void setUp() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml", "consumer.xml" });
        context.start();
        helloWorldApi = (HelloWorldApi) context.getBean("helloWorldApi");// 获取bean
    }

    @Test
    public void testHelloWorld() {
        String helloWorld = helloWorldApi.getHelloWorld("11");
        System.out.println(helloWorld);
    }
}

