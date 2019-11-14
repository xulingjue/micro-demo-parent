package xyz.micro_demo.mail.controller;

import com.github.structlog4j.ILogger;
import com.github.structlog4j.SLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.micro_demo.bot.common.api.BaseResponse;
import xyz.micro_demo.mail.dto.EmailRequest;
import xyz.micro_demo.mail.service.MailSendService;

import javax.validation.Valid;

/**
 * MailController
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/12 14:47
 * @Version V1.0
 */
@RestController
@RequestMapping("/v1")
@Validated
public class MailController {

    private static ILogger logger = SLoggerFactory.getLogger(MailController.class);

    @Autowired
    private MailSendService mailSendService;

    @PostMapping(path = "/send")
    public BaseResponse send(@RequestBody @Valid EmailRequest request) {
        mailSendService.sendMailAsync(request);
        return BaseResponse.builder().message("email has been sent async.").build();
    }

}
