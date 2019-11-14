package xyz.micro_demo.mail.service;

import com.github.structlog4j.ILogger;
import com.github.structlog4j.SLoggerFactory;
import org.springframework.stereotype.Service;
import xyz.micro_demo.mail.dto.EmailRequest;

/**
 * MailSendService
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/12 14:45
 * @Version V1.0
 */
@Service
public class MailSendService {
    private static ILogger logger = SLoggerFactory.getLogger(MailSendService.class);

    //@Async(AppConfig.ASYNC_EXECUTOR_NAME)
    public void sendMailAsync(EmailRequest req) {
        logger.info("this is mail send service!");
    }
}
