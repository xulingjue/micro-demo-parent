package xyz.micro_demo.account.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * AccountDto
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/8 17:06
 * @Version V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {
    @NotBlank
    private String id;
    private String name;
    @Email(message = "Invalid email")
    private String email;
}
