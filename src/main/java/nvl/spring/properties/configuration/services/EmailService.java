package nvl.spring.properties.configuration.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailService implements IMessageService{
    @Override
    public String getSendMessage() {
        return "Email sending...";
    }
}
