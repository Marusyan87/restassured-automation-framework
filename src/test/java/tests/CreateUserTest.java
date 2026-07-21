package tests;

import api.UserApi;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import models.User;
import org.junit.jupiter.api.Test;
import utils.FakerUtils;
import utils.ResponseValidator;

import static utils.ResponseSpecs.success201;

public class CreateUserTest {

    @Test
    @Owner("Marius")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that a new user can be created successfully using dynamic test data.")
    public void createUserTest() {

        final UserApi userApi = new UserApi();

        final String randomName = FakerUtils.getRandomName();
        final String randomJob = FakerUtils.getRandomJob();

        User user = new User(
                randomName,
                randomJob
        );

        Response response = userApi.createUser(user);

        response.then().spec(success201());

        ResponseValidator.validateField(response, "name", randomName);
        ResponseValidator.validateField(response, "job", randomJob);
    }
}