package com.criteo.marketing.examples;

import com.criteo.marketing.ApiClient;
import com.criteo.marketing.ApiException;
import com.criteo.marketing.Configuration;
import com.criteo.marketing.api.AdvertisersApi;
import com.criteo.marketing.model.CampaignMessage;

import java.util.List;

public class ExampleApplication {
    public static void main(String[] args) {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setUsername("client-id");
        client.setPassword("client-secret");

        // Uncomment the following line to enable debugging logs.
        // client.setDebugging(true);

        AdvertisersApi myApi = new AdvertisersApi(client);
        try {
            List<CampaignMessage> campaigns = myApi.getCampaigns(1, "");
        } catch (ApiException e) {
            System.out.println(e.getCode());
            System.out.println(e.getResponseBody());
        }
    }
}
