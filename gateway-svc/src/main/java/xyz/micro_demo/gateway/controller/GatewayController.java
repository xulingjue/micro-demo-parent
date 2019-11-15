package xyz.micro_demo.gateway.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/15 16:02
 * @Version V1.0
 */
@RestController
@RequestMapping(value = "/v1")
@Validated
public class GatewayController {
}
