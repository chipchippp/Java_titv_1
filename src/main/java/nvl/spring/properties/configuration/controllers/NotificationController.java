package nvl.spring.properties.configuration.controllers;

import nvl.spring.properties.configuration.services.EmailService;
import nvl.spring.properties.configuration.services.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    private IMessageService messageService;

    @Autowired
    public NotificationController(EmailService emailService) {
        this.messageService = emailService;
    }

    @GetMapping("/notification")
    public String getNotification() {
        return messageService.getSendMessage();
    }
}
