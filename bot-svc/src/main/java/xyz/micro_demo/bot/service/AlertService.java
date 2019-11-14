package xyz.micro_demo.bot.service;

import com.github.structlog4j.ILogger;
import com.github.structlog4j.SLoggerFactory;
import org.springframework.stereotype.Service;
import xyz.micro_demo.bot.dto.AlertNewShiftRequest;

/**
 * BotService
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/12 11:09
 * @Version V1.0
 */
@Service
public class AlertService {

    static final ILogger logger = SLoggerFactory.getLogger(AlertService.class);

    public void alertNewShift(AlertNewShiftRequest req) {
        logger.info("this is alert service alertNewShift!");
    }
}
