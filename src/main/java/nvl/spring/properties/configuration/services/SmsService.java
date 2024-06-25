package nvl.spring.properties.configuration.services;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements IMessageService{
    @Override
    public String getSendMessage() {
        return "SMS message";
    }
}
