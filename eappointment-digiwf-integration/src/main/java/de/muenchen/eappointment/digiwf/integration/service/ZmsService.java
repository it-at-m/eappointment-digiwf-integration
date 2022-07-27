package de.muenchen.eappointment.digiwf.integration.service;

import lombok.RequiredArgsConstructor;
import org.openapitools.client.api.ProcessApi;
import org.openapitools.client.model.InlineObject26;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

@Service
@RequiredArgsConstructor
public class ZmsService {

    final private ProcessApi processApi;

    public void confirmAppointment(InlineObject26 process) throws RestClientException {
        processApi.processStatusConfirmedPost(process);
    }
}
