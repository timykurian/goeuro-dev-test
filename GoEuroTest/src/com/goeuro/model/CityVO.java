package com.goeuro.model;

import com.goeuro.model.Names;

/**
 * Created by Timy on 12/09/16.
 */

public class CityVO {

    private String countryId;

    private String inEurope;

    private String locationId;

    private String countryCode;

    private String iata_airport_code;

    private String type;

    private String country;

    private String coreCountry;

    private GeoPosition geo_position;

    private String distance;

    private String _id;
    private Names names;

    private String name;

    private String fullName;

    private String alternativeNames;

    private String key;

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getInEurope() {
        return inEurope;
    }

    public void setInEurope(String inEurope) {
        this.inEurope = inEurope;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getIata_airport_code() {
        return iata_airport_code;
    }

    public void setIata_airport_code(String iata_airport_code) {
        this.iata_airport_code = iata_airport_code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCoreCountry() {
        return coreCountry;
    }

    public void setCoreCountry(String coreCountry) {
        this.coreCountry = coreCountry;
    }



    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Names getNames() {
        return names;
    }

    public void setNames(Names names) {
        this.names = names;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(String alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public GeoPosition getGeo_position() {
        return geo_position;
    }

    public void setGeo_position(GeoPosition geo_position) {
        this.geo_position = geo_position;
    }


    @Override
    public String toString() {
        return "ClassPojo [countryId = " + countryId + ", inEurope = " + inEurope + ", locationId = " + locationId + ", countryCode = " + countryCode + ", iata_airport_code = " + iata_airport_code + ", type = " + type + ", country = " + country + ", coreCountry = " + coreCountry + ", geo_position = " + geo_position + ", distance = " + distance + ", _id = " + _id + ", names = " + names + ", name = " + name + ", fullName = " + fullName + ", alternativeNames = " + alternativeNames + ", key = " + key + "]";
    }


}
