package utils;

import io.restassured.response.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ResponseValidator {

    public static void validateStatusCode(Response response, int expectedStatusCode) {
        assertThat(response.getStatusCode(), equalTo(expectedStatusCode));
    }

    public static void validateField(Response response, String field, Object expectedValue) {
        assertThat(response.jsonPath().get(field), equalTo(expectedValue));
    }

    public static void validateFields(Response response,
                                      String field1, Object value1,
                                      String field2, Object value2,
                                      String field3, Object value3) {

        validateField(response, field1, value1);
        validateField(response, field2, value2);
        validateField(response, field3, value3);
    }
}