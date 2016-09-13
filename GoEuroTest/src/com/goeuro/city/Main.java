package com.goeuro.city;

import com.goeuro.CitySearchService;
import com.goeuro.exception.CityException;
import com.goeuro.model.CityVO;
import com.goeuro.model.GeoPosition;
import com.goeuro.reports.ReportGenerator;
import com.goeuro.validator.GoEuroValidator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.*;

public class Main {

    public static void main(String[] args) throws CityException {

        if (args != null && args.length > 0) {
            String cityName = args[0];
            if (GoEuroValidator.validateCity(cityName)) {
                List<CityVO> response = CitySearchService.searchCityDetails(cityName);
                if (response != null) {
                    ReportGenerator.generateCSVReport(response,cityName);
                } else {
                    throw new CityException("No data available for the given city in the system!");
                }
            }
        } else {
            throw new CityException("Please enter the city as an argument");
        }

    }



}
