package com.goeuro.model;

/**
 * Created by Timy on 12/09/16.
 */

public class GeoPosition {

    private String longitude;

    private String latitude;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "ClassPojo [longitude = " + longitude + ", latitude = " + latitude + "]";
    }
}
