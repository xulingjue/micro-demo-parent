package xyz.micro_demo.account.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * VerifyPasswordRequest
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/8 18:28
 * @Version V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VerifyPasswordRequest {
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
