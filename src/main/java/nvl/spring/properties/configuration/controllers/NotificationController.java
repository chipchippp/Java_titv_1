package nvl.spring.properties.configuration.controllers;

import nvl.spring.properties.configuration.services.EmailService;
import nvl.spring.properties.configuration.services.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
//    Field injection là cách tiêm phụ thuộc vào Spring Framework
//    thông qua việc sử dụng annotation @Autowired.
    @Autowired
    private IMessageService messageService;

//    Constructor injection
//    @Autowired
//    public NotificationController(EmailService emailService) {
//        this.messageService = emailService;
//    }

//    Setter injection
//    @Autowired
//    public void setMessageService(EmailService emailService) {
//        this.messageService = emailService;
//    }

    @GetMapping("/notification")
    public String getNotification() {
        return messageService.getSendMessage();
    }
}
