package ru.netology.echo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class PostmanEchoTest {
    @Test
    void shouldResponseEcho() {
        String text = "Hi";
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hi"))
        ;
    }

}
