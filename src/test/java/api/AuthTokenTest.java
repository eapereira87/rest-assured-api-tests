package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class AuthTokenTest {

  @Test
  void deveGerarToken() {
    String token =
      given()
        .baseUri("https://restful-booker.herokuapp.com")
        .contentType(ContentType.JSON)
        .body("{\"username\":\"admin\",\"password\":\"password123\"}")
      .when()
        .post("/auth")
      .then()
        .statusCode(200)
        .extract()
        .path("token");

    assertNotNull(token);
    assertFalse(token.isBlank());
  }
}
