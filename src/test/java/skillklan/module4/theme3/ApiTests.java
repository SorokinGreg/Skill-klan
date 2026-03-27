package skillklan.module4.theme3;

import io.restassured.http.ContentType;
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
//                .get("https://petstore.swagger.io/v2/pet/12122012")
                .then()
                .log().all()
                .extract().response();

        Assert.assertEquals(res.getStatusCode(), 200, "Failed");
    }

    @Test
    public void postPet() {
        Post requestPost = new Post();
        requestPost.id = 12122012;
        requestPost.name = "bobik";
        requestPost.status = "dead";

        Post responsePost = given()
                .contentType(ContentType.JSON)
                .body(requestPost)
                .log().all()
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .log().all()
                .extract().as(Post.class);

        Assert.assertEquals(responsePost.id, requestPost.id, "id return not correct");
        Assert.assertEquals(responsePost.name, requestPost.name, "name return not correct");
        Assert.assertEquals(responsePost.status, requestPost.status, "status return not correct");
    }
}

