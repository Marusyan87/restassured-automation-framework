package tests;

import io.restassured.RestAssured;
import models.User;
import org.junit.jupiter.api.Test;
import utils.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UpdateUserTest {

    @Test
    public void updateUserTest() {

        RestAssured.baseURI = ConfigReader.get("baseUrl");

        User user = new User("Marius", "Senior QA");

        given()
                .contentType("application/json")
                .body(user)
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .body("name", equalTo("Marius"))
                .body("job", equalTo("Senior QA"));
    }
}