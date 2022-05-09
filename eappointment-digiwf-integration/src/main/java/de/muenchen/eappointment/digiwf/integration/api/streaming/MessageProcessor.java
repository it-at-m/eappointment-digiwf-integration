package de.muenchen.eappointment.digiwf.integration.api.streaming;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MessageProcessor {


//    private final MailingService mailingService;
//    private final CorrelateMessageService correlateMessageService;
//    private static final String MAIL_SENT_STATUS = "mailSentStatus";
//
//    /**
//     * All messages from the route "sendMailFromEventBus" go here.
//     *
//     * @return the consumer
//     */
//    @Bean
//    public Consumer<Message<Mail>> sendMailFromEventBus() {
//        return message -> {
//            log.info("Processing new mail from eventbus");
//            final Mail mail = message.getPayload();
//            log.debug("Mail: {}", mail);
//            try {
//                mailingService.sendMail(mail);
//                emitResponse(message.getHeaders(), true);
//            } catch (final MissingInformationMailException | MailException e) {
//                log.error("Mail could not be sent: {}", e.getMessage());
//                emitResponse(message.getHeaders(), false);
//            }
//        };
//    }
//
//    /**
//     * Function to emit a reponse using the correlateMessageService of digiwf-spring-cloudstream-utils
//     *
//     * @param messageHeaders The MessageHeaders of the incoming message you want to correlate your answer to
//     * @param status         true when the e-mail has been sent, false when an error occured
//     */
//    public void emitResponse(final MessageHeaders messageHeaders, final boolean status) {
//        final Map<String, Object> correlatePayload = new HashMap<>();
//        correlatePayload.put(MAIL_SENT_STATUS, status);
//        correlateMessageService.sendCorrelateMessage(messageHeaders, correlatePayload);
//    }
}
