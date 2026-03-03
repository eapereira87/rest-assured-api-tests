![CI](https://github.com/eapereira87/rest-assured-api-tests/actions/workflows/ci.yml/badge.svg)

# RestAssured API Tests

Suite simples de testes automatizados de API em Java usando RestAssured + JUnit 5.

API pública utilizada:
https://restful-booker.herokuapp.com

## Requisitos
- Java 17+
- Maven

## Rodar local
mvn -q test

## O que tem aqui
- Geração de token (auth)
- Listagem de bookings
- Criação de booking

Obs.: a API é pública e pode ficar instável em alguns momentos.
