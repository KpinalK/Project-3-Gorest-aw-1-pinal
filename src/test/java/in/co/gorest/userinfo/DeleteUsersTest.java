package in.co.gorest.userinfo;

import in.co.gorest.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class DeleteUsersTest extends TestBase {

    @Test
    public void deleteTheUser() {
        given().log().all()
                .header("Authorization", "869ca9b8946902daf33dbae2e2a5f53a0d51c513c7156f616fd30743a90c3903")
                .pathParam("id", 7599486)
                .when()
                .delete("/{id}")
                .then().log().all()
                .statusCode(204);

    }
}
