package com.unac.stepsdefinitions;

import com.unac.apis.GoRestApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetGoRestStepsdefinitions {
    @Given("se establece la base url {string}")
    public void seEstableceLaBaseUrl(String baseUrl) {
        GoRestApi.setBaseUrl(baseUrl);
    }

    @When("se consulta en el endpoint {string} por id {string}")
    public void seConsultaEnElEndpointPorId(String endPoint, String idUser) {
        GoRestApi.executionGetToken(endPoint, idUser);
    }

    @When("se modifica el usuario en el endpoint {string} con id {string} con nombre {string} y email {string}")
    public void seModificaElUsuarioEnElEndpointConIdConNombreYEmail(String endPoint, String idUser, String name, String email) {
        GoRestApi.executionPut(endPoint, idUser, name, email);
    }

    @Then("se valida que el status code {int} y que contenga el nombre {string}")
    public void seValidaQueElStatusCodeYQueContengaElNombre(Integer statusCode, String name) {
        GoRestApi.validateResponse(statusCode, name);
    }

    @Then("se valida que el status code {int} y que el nombre sea {string} y el email sea {string}")
    public void seValidaQueElStatusCodeYQueElNombreSeaYElEmailSea(Integer statusCode, String name, String email) {
        GoRestApi.validateResponse(statusCode, name, email);
    }
}
