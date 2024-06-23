package nvl.spring.properties.configuration.services;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements IMessageService{
    @Override
    public String getSendMessage() {
        return "Email sending...";
    }
}
