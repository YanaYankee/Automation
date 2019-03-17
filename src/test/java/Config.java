public class Config {
    //public static (the only one )  final =>constant (uppercase + _ , other variables camelCase)
    public static final String PET_STORE_BASE_HOST = "https://petstore.swagger.io/v2";

    public static final String GET_PET_ENDPOINT = "/pet/{id}"; //instead of 0 another

    public static final String GET_PET_STATUS_ENDPOINT = "/pet/findByStatus"; //queryParam adds variable {status} https://petstore.swagger.io/v2/pet/findByStatus?status=available

}
