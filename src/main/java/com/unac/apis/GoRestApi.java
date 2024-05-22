package com.unac.apis;

import com.unac.restinteractions.RestInteractions;

public class GoRestApi {

    private static final String TOKEN = "595a1ff490d5cfb582b0fa16f1d2bcc5373e289986153b248bec5ead417d8edd";
    private static String pathName = "name";
    private static String pathEmail = "email";

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.setBaseUrl(baseUrl);
    }

    public static void executionGetToken(String endPoint, String idUser){
        RestInteractions.executionGetToken(endPoint, idUser, TOKEN);
    }

    public static void executionPut(String endPoint, String idUser, String name, String email){
        RestInteractions.executionPut(endPoint, idUser, TOKEN, name, email);
    }

    public static void validateResponse(Integer statusCode, String name, String email) {
        RestInteractions.validateCode(statusCode);
        RestInteractions.validateDataResponse(name, pathName);
        RestInteractions.validateDataResponse(email, pathEmail);
    }

    public static void validateResponse(Integer statusCode, String name) {
    }
}
