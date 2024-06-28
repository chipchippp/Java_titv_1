package nvl.spring.properties.configuration.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailService implements IMessageService{
    public EmailService() {
        System.out.println("Constructor of class: "+getClass().getSimpleName());
    }

    @Override
    public String getSendMessage() {
        return "Email sending...";
    }
}
