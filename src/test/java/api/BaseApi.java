package api;

import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utils.ConfigReader;

public class BaseApi {

    protected RequestSpecification request;

    public BaseApi() {

        RestAssured.baseURI = ConfigReader.get("baseUrl");

        request = RestAssured
                .given()
                .log().ifValidationFails(LogDetail.ALL)
                .contentType(ContentType.JSON);
    }
}