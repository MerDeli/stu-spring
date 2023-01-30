package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @Author:
 * @createTime: 2023/01/30 09:54:28
 * @version:
 * @Description:
 */
public class SimpleBeanContainerTest {

    @Test
    public void testGetBean() throws Exception{
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService",new HelloService());
        HelloService helloService = (HelloService)beanFactory.getBean("helloService");
        assertThat(helloService).isNotNull();
        assertThat(helloService.sayHello()).isEqualTo("hello");
    }


    class HelloService{
        public String sayHello(){
            System.out.println("hello");
            return "hello";
        }
    }
}
