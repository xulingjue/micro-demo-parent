package xyz.micro_demo.mail.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * EmailRequest
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/12 12:08
 * @Version V1.0
 */
@Data
@Builder
public class EmailRequest {

    @NotBlank(message = "Please provide an email")
    private String to;
    @NotBlank(message = "Please provide a subject")
    private String subject;
    @NotBlank(message = "Please provide a valid body")
    @JsonProperty("html_body")
    private String htmlBody;
    private String name;
}
