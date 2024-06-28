package nvl.spring.properties.configuration.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SmsService implements IMessageService{
    public SmsService() {
        System.out.println("Constructor of class: "+getClass().getSimpleName());
    }
    @Override
    public String getSendMessage() {
        return "SMS message";
    }
}
