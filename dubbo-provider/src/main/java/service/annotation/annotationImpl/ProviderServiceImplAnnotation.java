package service.annotation.annotationImpl;

import service.annotation.ProviderServiceAnnotation;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * 注解方式实现类
 */
@Service(timeout = 5000)
public class ProviderServiceImplAnnotation implements ProviderServiceAnnotation {

    public String sayHelloAnnotation(String word) {
        return "annotation:" + word;
    }
}