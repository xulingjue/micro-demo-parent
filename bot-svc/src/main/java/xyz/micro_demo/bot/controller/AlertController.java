package xyz.micro_demo.bot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.micro_demo.bot.common.api.BaseResponse;
import xyz.micro_demo.bot.dto.AlertNewShiftRequest;
import xyz.micro_demo.bot.service.AlertService;

/**
 * AlertController
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/12 11:15
 * @Version V1.0
 */
@RestController
@RequestMapping(value = "/v1")
@Validated
public class AlertController {
    @Autowired
    private AlertService alertService;

    @PostMapping(value = "alert_new_shift")
    public BaseResponse alertNewShift(@RequestBody @Validated AlertNewShiftRequest request) {
        alertService.alertNewShift(request);
        return BaseResponse.builder().message("new shift alerted").build();
    }
}
