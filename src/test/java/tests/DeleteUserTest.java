package tests;

import api.UserApi;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import static utils.ResponseSpecs.success200;

public class DeleteUserTest {

    @Test
    @Owner("Marius")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that a user can be deleted successfully.")
    public void deleteUserTest() {

        UserApi userApi = new UserApi();

        Response response = userApi.deleteUser(1);

        response.then().spec(success200());
    }
}