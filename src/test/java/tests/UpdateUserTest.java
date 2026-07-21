package tests;

import api.UserApi;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import models.User;
import org.junit.jupiter.api.Test;
import utils.ResponseValidator;

import static utils.ResponseSpecs.success200;

public class UpdateUserTest {

    @Test
    @Owner("Marius")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that an existing user can be updated successfully.")
    public void updateUserTest() {

        UserApi userApi = new UserApi();

        User user = new User(
                "Marius",
                "Senior QA"
        );

        Response response = userApi.updateUser(2, user);

        response.then().spec(success200());

        ResponseValidator.validateField(response, "name", "Marius");
        ResponseValidator.validateField(response, "job", "Senior QA");
    }
}