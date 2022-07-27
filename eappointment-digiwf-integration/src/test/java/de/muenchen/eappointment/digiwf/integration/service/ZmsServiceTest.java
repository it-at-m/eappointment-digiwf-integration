package de.muenchen.eappointment.digiwf.integration.service;

import org.openapitools.client.api.ProcessApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
public class ZmsServiceTest {

    @Autowired
    private ZmsService zmsService;

    @Autowired
    private ProcessApi processApi;

//    @Test
//    public void test1() {
////        InlineResponse2002DataScopeProvider provider = new InlineResponse2002DataScopeProvider();
////        provider.setId(new BigDecimal(7777));
////        provider.setSource("dldb");
////
////        InlineObject8 scope = new InlineObject8();
////        scope.setProvider(provider);
////
////        CalendarRequests calendarRequests = new CalendarRequests();
////        calendarRequests.setId("10001");
////        calendarRequests.setSource("dldb");
////        calendarRequests.setName("Meldewesen und Ordnung");
////
////        InlineObject19 appointment = new InlineObject19();
////        Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now().plusDays(1));
////        appointment.setDate(new BigDecimal(timestamp.getTime()));
////
////        InlineObject25 req = new InlineObject25();
////        req.setRequests(Lists.newArrayList(calendarRequests));
////        req.setScope(scope);
////        req.setAppointments(Lists.newArrayList(appointment));
////
////        zmsService.createAppointment(req, 1, "public", 1);
//        zmsService.confirmAppointment();
//    }

}