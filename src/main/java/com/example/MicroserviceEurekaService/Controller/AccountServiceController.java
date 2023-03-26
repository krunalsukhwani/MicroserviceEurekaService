package com.example.MicroserviceEurekaService.Controller;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class AccountServiceController {

    public void getAccountInformation(){
        String baseUrl = "http://localhost:8761/account";
        var restTemplate = new RestTemplate();
        ResponseEntity<String> response = null;
        try{
            response = restTemplate.exchange(baseUrl, HttpMethod.GET,getHeaders(),String.class);
        }catch (Exception ex){
            System.out.println("Error while calling server: " + ex);
        }
        System.out.println(response.getBody());
    }

    private static HttpEntity<?> getHeaders(){
        var headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<>(headers);
    }
}
