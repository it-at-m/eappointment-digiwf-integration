package de.muenchen.eappointment.digiwf.integration.api.streaming;

import de.muenchen.eappointment.digiwf.integration.service.ZmsService;
import io.muenchendigital.digiwf.spring.cloudstream.utils.api.streaming.service.CorrelateMessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.openapitools.client.model.InlineObject26;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

@Slf4j
@Component
@RequiredArgsConstructor
public class MessageProcessor {
    private final ZmsService zmsService;

    //private final CorrelateMessageService correlateMessageService;

    private static final String APPOINTMENT_CONFIRMED_STATUS = "appointmentConfirmedStatus";

    @KafkaListener(topics = "tobias",
            groupId = "group_id")

    // Method
    public void
    confirmAppointmentFromEventBus_AlternateImplementation(String message)
    {
        // Print statement
        System.out.println("message here also22 = " + message);
    }

    @Bean
    public Consumer<Message<InlineObject26>> confirmAppointmentFromEventBus() {
        return message -> {
            log.info("Processing new appointment from eventbus");
            InlineObject26 process = message.getPayload();
            log.debug("Appointment: {}", process);
            try {
                zmsService.confirmAppointment(process);
                emitResponse(message.getHeaders(), true);
            } catch (final RestClientException e) {
                log.error("Appointment could not be confirmed: {}", e.getMessage());
                emitResponse(message.getHeaders(), false);
            }
        };
    }

    public void emitResponse(final MessageHeaders messageHeaders, final boolean status) {
        final Map<String, Object> correlatePayload = new HashMap<>();
        correlatePayload.put(APPOINTMENT_CONFIRMED_STATUS, status);
        //correlateMessageService.sendCorrelateMessage(messageHeaders, correlatePayload);
    }
}
