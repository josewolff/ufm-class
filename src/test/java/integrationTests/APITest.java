package integrationTests;

import apiTestingAuxClasses.RequestMaker;
import dataProviders.DataProviders;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITest {

    @Test(groups = {"all","get"})
    public void getTest(){
        String getAllUsers = "http://localhost:5001/users/all";
        Response response = RequestMaker.makeGetRequest(getAllUsers);
        String responseString = response.asString();
        System.out.println(responseString);
        JSONArray jsonArray =  new JSONArray(responseString);
        System.out.println(jsonArray.toString(10));
        if(jsonArray.length() == 0){
            Assert.fail("Fail test - Get Users is empty.");
        }
    }

    @Test(groups = {"all","get"}, dataProvider = "postContent",
            dataProviderClass = DataProviders.class)
    public void createUsers(String json){
        System.out.println(json);
        String createUsersUrl = "http://localhost:5001/users/add";
        Response response = RequestMaker.makePostRequest(createUsersUrl, json);
        String responseString = response.asString();
        System.out.println(responseString);
        System.out.println("\n\n");
    }

}
