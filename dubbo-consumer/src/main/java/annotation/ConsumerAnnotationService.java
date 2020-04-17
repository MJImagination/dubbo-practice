package annotation;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import service.annotation.ProviderServiceAnnotation;

/**
 * 注解方式的service
 */
@Component("annotatedConsumer")
public class ConsumerAnnotationService {

    @Reference
    private ProviderServiceAnnotation providerServiceAnnotation;

    public String doSayHello(String name) {
        return providerServiceAnnotation.sayHelloAnnotation(name);
    }
}