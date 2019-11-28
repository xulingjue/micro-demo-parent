package xyz.micro_demo.account.controller;

import com.github.structlog4j.ILogger;
import com.github.structlog4j.SLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xyz.micro_demo.account.dto.AccountDto;
import xyz.micro_demo.account.dto.GenericAccountResponse;
import xyz.micro_demo.account.dto.VerifyPasswordRequest;
import xyz.micro_demo.account.service.AccountService;
import xyz.micro_demo.common.auth.AuthConstant;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * AccountController
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/11 10:38
 * @Version V1.0
 */
@RestController
@RequestMapping("/v1/account")
@Validated
public class AccountController {
    static final ILogger logger = SLoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    @GetMapping(path = "/{userId}")
    public GenericAccountResponse getAccount(@PathVariable @NotBlank String userId) {

        AccountDto accountDto = accountService.get(userId);

        GenericAccountResponse genericAccountResponse = new GenericAccountResponse(accountDto);
        return genericAccountResponse;
    }

    @PostMapping(path = "/verify_password")
    public GenericAccountResponse verifyPassword(@RequestHeader(AuthConstant.AUTHORIZATION_HEADER) String authz, @RequestBody @Valid VerifyPasswordRequest request) {
        return null;
    }

}
