package com.api;

import static org.junit.Assert.*;
import static com.jayway.restassured.RestAssured.get;
import org.junit.Test;
import com.jayway.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;

public class get {

    @Test
    public void getRequestFindCapital () throws JSONException {

        //запрос get для доступа ко всем параметрам ответа
        Response response = get("http://restcountries.eu/rest/v1/name/ukraine");

        //задание переменной в формате json
        JSONArray jsonResponse = new JSONArray(response.asString());

        //задание стринги для параметра "столица", которая считывается из ответа
        String capital = jsonResponse.getJSONObject(0)
                .getString("capital");

        //проверка ожидаемого значения параметра "столица"
        assertEquals(capital, "Kiev");
    }
}
