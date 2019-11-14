package xyz.micro_demo.account.dto;

import lombok.*;
import xyz.micro_demo.bot.common.api.BaseResponse;

/**
 * GenericAccountResponse
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/8 17:05
 * @Version V1.0
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class GenericAccountResponse  extends BaseResponse {
    private AccountDto account;
}
