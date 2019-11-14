package xyz.micro_demo.account.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import xyz.micro_demo.account.AccountConstant;
import xyz.micro_demo.account.dto.GenericAccountResponse;
import xyz.micro_demo.account.dto.VerifyPasswordRequest;
import xyz.micro_demo.bot.common.auth.AuthConstant;

import javax.validation.Valid;

/**
 * AccountClient
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/8 15:40
 * @Version V1.0
 */
@FeignClient(name = AccountConstant.SERVICE_NAME, path = "/v1/account", url = "${micro-demo.account-service-endpoint}")
public interface AccountClient {

    @PostMapping(path = "/verify_password")
    GenericAccountResponse verifyPassword(@RequestHeader(AuthConstant.AUTHORIZATION_HEADER) String authz, @RequestBody @Valid VerifyPasswordRequest request);
}
