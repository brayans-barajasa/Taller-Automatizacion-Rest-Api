package com.unac.restinteractions;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import static org.junit.Assert.assertEquals;

public class RestInteractions {

    private static String baseUrl;

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.baseUrl = baseUrl;
    }

    public static void executionGetToken(String endPoint, String idUser, String token) {
        SerenityRest.given().auth().oauth2(token)
                .contentType(ContentType.JSON).when()
                .get(baseUrl.concat(endPoint).concat(idUser));

        SerenityRest.lastResponse().prettyPeek();
    }

    public static void executionPut(String endPoint, String idUser, String token, String name, String email) {
        SerenityRest.given().auth().oauth2(token)
                .contentType(ContentType.JSON)
                .body("{\"name\":\"" + name + "\", \"email\":\"" + email + "\"}")
                .when()
                .put(baseUrl.concat(endPoint).concat(idUser));

        SerenityRest.lastResponse().prettyPeek();
    }

    public static void validateCode(Integer statusCode) {
        Integer statusActual = SerenityRest.lastResponse().statusCode();
        assertEquals(statusActual, statusCode);
    }

    public static void validateDataResponse(String value, String path) {
        String actualValue = SerenityRest.lastResponse().jsonPath().getString(path);
        assertEquals(actualValue, value);
    }
}
