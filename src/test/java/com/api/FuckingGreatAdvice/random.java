package com.api.FuckingGreatAdvice;

import static org.junit.Assert.*;
import static com.jayway.restassured.RestAssured.get;
import org.junit.Test;
import com.jayway.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;

public class random {

    @Test
    public void random () throws JSONException {

        //запрос get для доступа ко всем параметрам ответа
        Response Response = get("http://fucking-great-advice.ru/api/random");

        //задание переменной в формате json
        JSONArray jsonResponse = new JSONArray(Response.asString());

        //задание стринги для параметра Х, которая считывается из ответа
//        String Parameter = jsonResponse.getJSONObject(0)
//                .
//                .getString("id");
//
//        //проверка ожидаемого значения параметра Х
//        assertEquals(Parameter, "Kiev");
    }
}
