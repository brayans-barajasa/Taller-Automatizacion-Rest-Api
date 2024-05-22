Feature: Automatización de REST API - POM
  Yo como estudiante de calidad de software
  necesito construir una petición a una API
  para aprender a automatizar servicios

  Scenario: Consultar un usuario con método GET
    Given se establece la base url "https://gorest.co.in/"
    When se consulta en el endpoint "public/v2/users/" por id "6920261"
    Then se valida que el status code 200 y que contenga el nombre "Jagadisha Asan"

  Scenario: Modificar un usuario con método PUT
    Given se establece la base url "https://gorest.co.in/"
    When se modifica el usuario en el endpoint "public/v2/users/" con id "6920261" con nombre "Brayan Stiven" y email "brayan@example.com"
    Then se valida que el status code 200 y que el nombre sea "Brayan Stiven" y el email sea "brayan@example.com"
