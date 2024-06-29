package nvl.spring.properties.configuration.controllers;

import nvl.spring.properties.configuration.services.EmailService;
import nvl.spring.properties.configuration.services.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
//    Field injection là cách tiêm phụ thuộc vào Spring Framework
//    thông qua việc sử dụng annotation @Autowired.
//@Autowired
    private final IMessageService emailService;
    private final IMessageService zaloService;
    private final IMessageService smsService;

//    Constructor injection
    @Autowired
//    @Qualifier("emailService")
    public NotificationController(
           @Qualifier("emailService") IMessageService emailService,
           @Qualifier("emailService") IMessageService zaloService,
           @Qualifier("smsService") IMessageService smsService) {
        this.emailService = emailService;
        this.zaloService = zaloService;
        this.smsService = smsService;
    }

//    Setter injection
//    @Autowired
//    public void setMessageService(EmailService emailService) {
//        this.messageService = emailService;
//    }

    @GetMapping("/sendEmail")
    public String getEmail() {
        return emailService.getSendMessage();
    }

//    @GetMapping ("/check")
//    public String check() {
//        return this.emailService== this.zaloService ? "Singleton" : "Prototype";
//    }
    @GetMapping("/sendZalo")
    public String getZalo() {
        return zaloService.getSendMessage();
    }

    @GetMapping("/sendSms")
    public String getSms() {
        return smsService.getSendMessage();
    }
}
