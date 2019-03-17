//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PetStoreTests {
    final PetEndpoint PET_ENDPOINT = new PetEndpoint();


    @Test
    public void getPetById200() {
        PET_ENDPOINT
                .getPetById(1)
                .then().statusCode(200);
    }
    @Test
    public void getPetById404() {
        PET_ENDPOINT
                .getPetById(0)
                .then().statusCode(404);
    }
    @Test
    public void getPetStatus200() {
        PET_ENDPOINT
                .getPetStatus("available")
                .then().statusCode(200);
    }
//
//    @Test
//    public void getPetById200 () {
//      //  baseSpecification()
//        given() //renamed from baseSpecification
//                .basePath(Config.GET_PET_ENDPOINT)
//                .pathParam("id",2)
//                .get()
//                .then().statusCode(200);
//    }


    //Moved to PetEndpoint.java
//  //  private RequestSpecification baseSpecification() { //setup base config
//  private RequestSpecification given() { //renamed from baseSpecification
//        return  RestAssured.given()
//                .baseUri(Config.PET_STORE_BASE_HOST)
//                .log().uri(); // log request
//    }



 //3 part
//
//    @Test
//    public void getPetById200 () {
//        RestAssured.
//                given()
//                .baseUri(Config.PET_STORE_BASE_HOST)
//        //        .basePath("/pet/1")
//                .basePath(Config.GET_PET_ENDPOINT)
//                .pathParam("id",2)
//              //  .baseUri("https://petstore.swagger.io/v2/pet/t")
//                .log().uri() // log request
//                .get()
//                .then().statusCode(200);
//    }

 //1-2 part

//    @Test
//    public void getPetById200 () {
//        //send request to get json
////        Response response = (Response) RestAssured.
////                given()
////                .baseUri("https://petstore.swagger.io/v2/pet/1")
////                .get()
////                .then().statusCode(200)
////                .and().extract().body();
////        System.out.println(response);
//
//        RestAssured.
//                given()
//                .baseUri("https://petstore.swagger.io/v2/pet/1")
//                .get()
//                .then().statusCode(200);
//    }
//
//    @Test
//    public void getPetById404 () {
//
//
//        RestAssured.
//                given()
//                .baseUri("https://petstore.swagger.io/v2/pet/t")
//                .get()
//                .then().statusCode(404);
//    }
}
