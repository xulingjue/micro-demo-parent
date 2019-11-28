package xyz.micro_demo.account.service;

import com.github.structlog4j.ILogger;
import com.github.structlog4j.SLoggerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.micro_demo.account.dto.AccountDto;
import xyz.micro_demo.bot.client.BotClient;
import xyz.micro_demo.bot.dto.GreetingRequest;

/**
 * AccountService
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/11 14:20
 * @Version V1.0
 */
@Service
@RequiredArgsConstructor
public class AccountService {

    @Autowired
    private BotClient botClient;

    static ILogger logger = SLoggerFactory.getLogger(AccountService.class);

    public AccountDto get(String userId) {
        logger.info("get accountDto");

        botClient.sendSmsGreeting(
                GreetingRequest.builder().userId("xxxx").build());

        AccountDto accountDto = new AccountDto();
        accountDto.setId(userId);
        accountDto.setEmail("lingjue@qq.com");
        accountDto.setName("BLUE");

        return accountDto;
    }
}
