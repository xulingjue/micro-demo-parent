package xyz.micro_demo.bot.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import xyz.micro_demo.bot.BotConstant;
import xyz.micro_demo.bot.common.api.BaseResponse;
import xyz.micro_demo.bot.dto.GreetingRequest;

/**
 * BotClient
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/11 16:22
 * @Version V1.0
 */
@FeignClient(name = BotConstant.SERVICE_NAME, path = "/v1", url = "${micro-demo.bot-service-endpoint}")
public interface BotClient {
    @PostMapping(path = "sms_greeting")
    BaseResponse sendSmsGreeting(@RequestBody @Validated GreetingRequest request);
}
