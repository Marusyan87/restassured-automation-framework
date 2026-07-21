package tests;

import api.UserApi;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import models.GetUserResponse;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static utils.ResponseSpecs.success200;

public class GetUserTest {

    @Test
    @Owner("Marius")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user details are returned successfully.")
    public void getSingleUserTest() {

        UserApi userApi = new UserApi();

        Response response = userApi.getUser(1);

        response.then().spec(success200());

        GetUserResponse user = response.as(GetUserResponse.class);

        assertThat(user.getId(), equalTo(1));
        assertThat(user.getName(), equalTo("Leanne Graham"));
        assertThat(user.getUsername(), equalTo("Bret"));
        assertThat(user.getEmail(), equalTo("Sincere@april.biz"));
    }
}