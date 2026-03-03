package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class BookingTest {

  @Test
  void deveListarBookings() {
    given()
      .baseUri("https://restful-booker.herokuapp.com")
    .when()
      .get("/booking")
    .then()
      .statusCode(200);
  }

  @Test
  void deveCriarBooking() {
    String payload = """
      {
        "firstname": "Erick",
        "lastname": "QA",
        "totalprice": 111,
        "depositpaid": true,
        "bookingdates": {
          "checkin": "2026-01-01",
          "checkout": "2026-01-05"
        },
        "additionalneeds": "Breakfast"
      }
    """;

    given()
      .baseUri("https://restful-booker.herokuapp.com")
      .contentType(ContentType.JSON)
      .body(payload)
    .when()
      .post("/booking")
    .then()
      .statusCode(200);
  }
}
