import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetEndpoint {

    //  private RequestSpecification baseSpecification() { //setup base config
    private RequestSpecification given() { //renamed from baseSpecification
        return  RestAssured.given()
                .baseUri(Config.PET_STORE_BASE_HOST)
                .contentType("application/json") //for POST requests!!! can pass String instead of JSON and server will take it
                .log().uri(); // log request
    }

    public Response getPetById(int petId) {
        return given()
                .basePath(Config.GET_PET_ENDPOINT)
                .pathParam("id", petId)
                .get()
                .then().extract().response();
    }
    public Response getPetStatus(String status) {
        return given()
                .basePath(Config.GET_PET_STATUS_ENDPOINT)
               // .pathParam("statusName", status)// will create wrong Request URI: https://petstore.swagger.io/v2/pet/findByStatus
                //.param("statusName", status) //query params
                .queryParam("statusName", status) //query params
                .get()
                .then().extract().response();
    }

    public Response createPet(String body) {
        return given()
                .basePath(Config.CREATE_PET)
                .body(body)
                .post()
                .then().extract().response();
    }

}
