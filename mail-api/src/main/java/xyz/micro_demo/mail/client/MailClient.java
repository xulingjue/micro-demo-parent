package xyz.micro_demo.mail.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import xyz.micro_demo.mail.MailConstant;
import xyz.micro_demo.common.api.BaseResponse;
import xyz.micro_demo.mail.dto.EmailRequest;

import javax.validation.Valid;

/**
 * MailClient
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/12 12:01
 * @Version V1.0
 */
@FeignClient(name = MailConstant.SERVICE_NAME, path = "/v1", url = "${micro-demo.mail-service-endpoint}")
public interface MailClient {
    @PostMapping(path = "/send")
    BaseResponse send(@RequestBody @Valid EmailRequest request);
}
