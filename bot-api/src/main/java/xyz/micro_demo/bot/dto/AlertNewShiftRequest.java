package xyz.micro_demo.bot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * AlertNewShiftRequest
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/12 11:20
 * @Version V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlertNewShiftRequest {
    @NotBlank
    private String userId;
}
