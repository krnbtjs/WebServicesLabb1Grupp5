package com.webservices.httphandler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class NamesHttpHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String requestParamValue = null;
        System.out.println(exchange.getRequestMethod());
        if("GET".equals(exchange.getRequestMethod())) {
            handleGetResponse(exchange);
        }
    }

    private void handleGetResponse(HttpExchange exchange) throws IOException {


//        OutputStream outputStream = exchange.getResponseBody();
//
//
//        exchange.getResponseHeaders().add("Content-Type", "application/json");
//
//        exchange.sendResponseHeaders(200, cursor.length());
//
//        outputStream.write(Integer.parseInt(cursor.toString()));
//
//        outputStream.flush();
//        outputStream.close();
    }
}