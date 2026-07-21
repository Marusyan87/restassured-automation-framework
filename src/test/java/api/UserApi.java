package api;

import io.restassured.response.Response;

public class UserApi extends BaseApi {

    private static final String USERS_ENDPOINT = "/users";

    public Response getUser(int id) {

        return request
                .when()
                .get(USERS_ENDPOINT + "/" + id);
    }

    public Response createUser(Object body) {

        return request
                .body(body)
                .when()
                .post(USERS_ENDPOINT);
    }

    public Response updateUser(int id, Object body) {

        return request
                .body(body)
                .when()
                .put(USERS_ENDPOINT + "/" + id);
    }

    public Response deleteUser(int id) {

        return request
                .when()
                .delete(USERS_ENDPOINT + "/" + id);
    }
}