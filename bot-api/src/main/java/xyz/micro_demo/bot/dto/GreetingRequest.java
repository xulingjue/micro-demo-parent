package xyz.micro_demo.bot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * GreetingRequest
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/11 16:28
 * @Version V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GreetingRequest {
    @NotBlank
    private String userId;
}
