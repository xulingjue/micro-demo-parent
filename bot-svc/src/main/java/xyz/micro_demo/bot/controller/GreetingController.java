package xyz.micro_demo.bot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.micro_demo.common.api.BaseResponse;
import xyz.micro_demo.bot.dto.GreetingRequest;
import xyz.micro_demo.bot.service.GreetingService;

/**
 * GreetingController
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/12 11:30
 * @Version V1.0
 */

@RestController
@RequestMapping(value = "/v1")
@Validated
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @PostMapping(value = "/sms_greeting")
    BaseResponse sendSmsGreeting(@RequestBody @Validated GreetingRequest request) {
        greetingService.greeting(request.getUserId());
        return BaseResponse.builder().message("greeting sent").build();
    }
}
