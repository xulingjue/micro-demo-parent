package xyz.micro_demo.bot.service;

import com.github.structlog4j.ILogger;
import com.github.structlog4j.SLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.micro_demo.mail.client.MailClient;
import xyz.micro_demo.mail.dto.EmailRequest;

/**
 * GreetingService
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/12 11:30
 * @Version V1.0
 */
@Service
public class GreetingService {

    @Autowired
    private MailClient mailClient;

    static final ILogger logger = SLoggerFactory.getLogger(GreetingService.class);

    public void greeting(String userId) {

        logger.info("this is the greeting service!");

        mailClient.send(EmailRequest.builder().name("xulingjue").subject("subject").htmlBody("htmlBody").build());
    }
}
