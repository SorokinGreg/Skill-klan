package skillklan.module4.theme3;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiTests {
    @Test
    public void getPet() {
        Response res = given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .log().all()
                .extract().response();

        int statusCode = res.getStatusCode();
        Assert.assertEquals(statusCode,200, "Failed");
    }

}

