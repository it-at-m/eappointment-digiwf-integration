package de.muenchen.eappointment.digiwf.integration.config;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.ProcessApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZmsConfig {

    @Bean
    public ApiClient getZmsClient() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("https://zms-dev.muenchen.de/terminvereinbarung/api/2/");
        return apiClient;
    }

    @Bean
    public ProcessApi processApi(ApiClient apiClient) {
        return new ProcessApi(apiClient);
    }

}
