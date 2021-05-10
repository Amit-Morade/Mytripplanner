package com.example.mytripplanner.model;

public class RecentData {

    String placename;
    String countryname;
    String price;
    Integer Imageurl;

    public RecentData(String placename, String countryname, String price,Integer Imageurl) {
        this.placename = placename;
        this.countryname = countryname;
        this.price = price;
        this.Imageurl =Imageurl;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public Integer getImageurl() {
        return Imageurl;
    }

    public void setImageurl(Integer imageurl) {
        Imageurl = imageurl;
    }




}
