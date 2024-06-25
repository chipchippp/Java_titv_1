package nvl.spring.properties.configuration.services;

import org.springframework.stereotype.Component;

@Component
public class ZaloService implements IMessageService{
    @Override
    public String getSendMessage() {
        return "Zalo message";
    }
}
