package com.edgar.conversordemonedas.API;

import com.edgar.conversordemonedas.Modelos.Moneda;
import com.edgar.conversordemonedas.Modelos.MonedaAPI;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conexion {

    String json;

    public String getJson() {
        return json;
    }

    public MonedaAPI HacerConversion(String conversionDeMoneda){


        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/3aca20c1f1da821e1f6f7178/pair/"+conversionDeMoneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            json = response.body();

            return new Gson().fromJson(json, MonedaAPI.class);

        } catch (Exception e) {
            throw new RuntimeException("No encontré esa moneda.");
        }


    }



}
