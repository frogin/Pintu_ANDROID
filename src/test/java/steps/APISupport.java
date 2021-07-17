package steps;

import Base.APIConstant;
import Base.RestAssuredExtension;
import Base.RestAssuredExtensionv2;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class APISupport {
    public static String token = "0";


    public static ResponseOptions<Response> response;

    @Given("^I Perform POST operation for \"([^\"]*)\" with body$")
    public void iPerformPOSTOperationForWithBody2(String url) throws Throwable {
        String id = "onboarding";
        String angka="123";
        String email = "abc@gmail.com";
        String okoye = "{\"id\":" + id + ",\"email\":" + email + "}";

        String param = "{\n" +
                "    \"grant_type\": \"" + id + "\",\n" +
                "    \"params\": [\n" +
                "        \"\",\n" +
                "        \"Test Device Name\", \"Test Device Manufacturer Apple\",\"Test Device Model\",\n" +
                "        \"Android 5.0.2 iOS\",\n" +
                "        \"MySmartfren\",\n" +
                "        \"6.3.3\",\n" +
                "        \"indonesia\",\n" +
                "        \"480\"\n" +
                "    ],\n" +
                "    \"imei\": \"867306034317506\",\n" +
                "    \"imeis\": {\n" +
                "        \"meid\": \"TESTSIP1000001\",\n" +
                "        \"imei1\": \"358796080492328\",\n" +
                "        \"imei2\": \"358796080492328358796080492328\"\n" +
                "    }\n" +
                "}";
        //Perform post operation
        //response = RestAssuredExtension.PostOpsWithBodyAndPathParams(url, param);
        RestAssuredExtensionv2 ReaRestAssuredV2 = new RestAssuredExtensionv2 (url, APIConstant.ApiMethods.POST, token);
        response = ReaRestAssuredV2.ExecutWitheBody(param);
        System.out.println(response.getBody().prettyPeek());
        System.out.println("API response body = " + response.getBody().asString());
        token = response.getBody().jsonPath().get("status");
        System.out.println(token);

    }


    @Given("^I ensure to Perform POST operation for \"([^\"]*)\" with body as$")
    public void iEnsureToPerformPOSTOperationForWithBodyAs(String url, DataTable table) throws Throwable {
        var data = table.raw();

        Map<String, String> body = new HashMap<>();
        body.put("id", data.get(1).get(0));
        body.put("title", data.get(1).get(1));
        body.put("author", data.get(1).get(2));

        //Perform post operation
        RestAssuredExtension.PostOpsWithBody(url, body);
    }

    @And("^I Perform DELETE operation for \"([^\"]*)\"$")
    public void iPerformDELETEOperationFor(String url, DataTable table) throws Throwable {
        var data = table.raw();

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("postid", data.get(1).get(0));

        //Perform Delete operation
        RestAssuredExtension.DeleteOpsWithPathParams(url, pathParams);
    }


    @And("^I perform GET operation with path parameter for \"([^\"]*)\"$")
    public void iPerformGETOperationWithPathParameterFor(String url, DataTable table) throws Throwable {
        var data = table.raw();

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("postid", data.get(1).get(0));

        response = RestAssuredExtension.GetWithPathParams(url, pathParams);
    }



    @And("^I Perform PUT operation for \"([^\"]*)\"$")
    public void iPerformPUTOperationFor(String url, DataTable table) throws Throwable {
        var data = table.raw();

        Map<String, String> body = new HashMap<>();
        body.put("id", data.get(1).get(0));
        body.put("title", data.get(1).get(1));
        body.put("author", data.get(1).get(2));

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("postid", data.get(1).get(0));

        //Perform post operation
        RestAssuredExtension.PUTOpsWithBodyAndPathParams(url, body, pathParams);

    }

}
