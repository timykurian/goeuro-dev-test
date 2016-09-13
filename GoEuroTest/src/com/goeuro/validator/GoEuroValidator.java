package com.goeuro.validator;

import com.goeuro.exception.CityException;

/**
 * Created by Timy on 12/09/16.
 */
public class GoEuroValidator {

    public static boolean validateCity(String cityName) throws CityException{
        if(cityName != null && cityName.length()>0){
            return true ;
        }else{
            throw new CityException("Please enter a valid city");
        }
    }
}
