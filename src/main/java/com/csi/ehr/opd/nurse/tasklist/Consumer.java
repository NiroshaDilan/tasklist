package com.csi.ehr.opd.nurse.tasklist;

import com.csi.ehr.opd.nurse.tasklist.dto.DoctorOrderDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
@Component
public class Consumer {

    private static Logger logger = LoggerFactory.getLogger(Consumer.class);

    @RabbitListener(queues = "${jsa.rabbitmq.queue}", containerFactory = "jsaFactory")
    public void recieveDoctorOrder(DoctorOrderDTO doctorOrderDTO) {
        logger.info("Recieved Doctor Ordrers -> {}", doctorOrderDTO);
    }
}
