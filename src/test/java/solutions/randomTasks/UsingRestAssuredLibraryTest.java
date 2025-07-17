package solutions.randomTasks;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class UsingRestAssuredLibraryTest {
    @Test
    public void testGoogle() {
        given()
                .when()
                .get("https://www.google.com/")
                .then()
                .statusCode(200);
    }
}