package nvl.spring.properties.configuration.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmailService implements IMessageService{
    @PostConstruct
    public void init() {
        System.out.println("Đoạn code này đc run ngay sau khi đc tạo: "+getClass().getSimpleName());
    }
    public EmailService() {
        System.out.println("Constructor of class: "+getClass().getSimpleName());
    }

    @Override
    public String getSendMessage() {
        return "Email sending...";
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Đoạn code này đc run trc khi đc hủy bỏ : "+getClass().getSimpleName());
    }
}
