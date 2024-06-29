package nvl.spring.properties.configuration.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ZaloService implements IMessageService{
//    Layzy là một annotation giúp Spring Boot tạo ra một bean
//    khi nó được yêu cầu, không phải khi ứng dụng được khởi động.
    public ZaloService() {
        System.out.println("Constructor of class: "+getClass().getSimpleName());
    }
    @Override
    public String getSendMessage() {
        return "Zalo message";
    }
}
