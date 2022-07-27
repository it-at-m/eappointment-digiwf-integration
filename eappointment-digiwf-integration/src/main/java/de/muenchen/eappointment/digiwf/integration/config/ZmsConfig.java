package de.muenchen.eappointment.digiwf.integration.config;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.ProcessApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZmsConfig {

    @Value("${zms.path}")
    private String zmsPath;

    @Bean
    public ApiClient getZmsClient() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(zmsPath);
        return apiClient;
    }

    @Bean
    public ProcessApi processApi(ApiClient apiClient) {
        return new ProcessApi(apiClient);
    }

}
