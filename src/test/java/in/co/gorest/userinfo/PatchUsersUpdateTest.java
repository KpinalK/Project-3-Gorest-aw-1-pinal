package in.co.gorest.userinfo;

import in.co.gorest.model.UserPojo;
import in.co.gorest.testbase.TestBase;
import in.co.gorest.utils.TestUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PatchUsersUpdateTest extends TestBase {

    @Test
    public void updateUserWithPatch(){

        String email = TestUtils.getRandomValue() + "vidhi@gmail.com";

        UserPojo userPojo = new UserPojo();
        userPojo.setName("Allasani Peddana");

        Response response = given().log().all()
                .header("Content-Type","application/json")
                .header("Authorization","869ca9b8946902daf33dbae2e2a5f53a0d51c513c7156f616fd30743a90c3903")
                .pathParam("id",7599478)
                .when()
                .body(userPojo)
                .patch("/users/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
