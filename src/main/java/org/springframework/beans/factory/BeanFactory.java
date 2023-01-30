package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:
 * @createTime: 2023/01/30 09:48:34
 * @version:
 * @Description:
 */
public class BeanFactory {
    private Map<String,Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean){
        beanMap.put(name,bean);
    }

    public Object getBean(String name){
        return beanMap.get(name);
    }
}
